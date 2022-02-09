import java.util.Scanner;

public class IsPerfectNumber {
    public static void isPerfectNumber() {
        int sum=0;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                System.out.println(i);
                sum=sum+i;
        }

        if(n == sum)
            System.out.println("Entered number is a Perfect Number .");
        else
            System.out.println("Entered number is not a Perfect Number.");
        sc.close();
    }

    public static void main(String[] args) {
        isPerfectNumber();
    }

}