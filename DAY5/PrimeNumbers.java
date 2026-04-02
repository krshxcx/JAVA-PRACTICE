package DAY5;
import java.util.Scanner;
import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.print("Enter range: ");
        int n = sc.nextInt();

        // Loop through every number from 2 to n
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            
            // Check if 'i' has any divisors
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false; // Found a divisor, so it's not prime
                    break; 
                }
            }
            
            if (isPrime) {
                list.add(i);
            }
        }
        
        System.out.println("Primes found: " + list);
        sc.close();
    }
}