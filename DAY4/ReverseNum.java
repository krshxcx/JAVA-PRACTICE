package DAY4;
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        
        int n = sc.nextInt();
        int result = 0;

        while (n != 0) {
            int last_digit = n % 10;
            result = result * 10 + last_digit;
            n = n / 10;
        }

        System.out.println("Reversed Number: " + result);
        sc.close();
    }
}