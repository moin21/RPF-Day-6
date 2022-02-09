
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args)
    {
        int reverse = 0;
        System.out.println("Enter Any No.");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int no = number;
        for(number =no; number != 0;)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the " + no +" number is: " + reverse);
    }
}
