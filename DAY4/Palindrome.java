package DAY4;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your number to check Palindrome or not:");

            if (!sc.hasNextInt()) {
                break;
            }

            int n = sc.nextInt();
            int original = n;
            int result = 0;

            while (n != 0) {
                int last_digit = n % 10;
                result = result * 10 + last_digit;
                n = n / 10;
            }

            if (original == result) {
                System.out.println("Yes, It is a Palindrome");
            } else {
                System.out.println("No, It is not a Palindrome");
            }
        }

        sc.close();
    }
}