import java.util.Scanner;
class FibonacciSeries {
    public static void main(String args[]) {
        int num1, num2, num3, count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no.");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd no.");
        num2 = sc.nextInt();
        System.out.println("Enter no. of terms in your Fibonacci Series.");
        count = sc.nextInt();
        System.out.print(num1+ " "+ num2+ " ");
        int i;
        for (i = 2; i < count; ++i)
        {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }

    }
}
