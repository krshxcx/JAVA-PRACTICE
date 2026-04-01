package DAY4;
import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not a prime");
        } else {
            boolean isPrime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Is a prime");
            } else {
                System.out.println("Not a prime");
            }
        }

        sc.close();
    }
}