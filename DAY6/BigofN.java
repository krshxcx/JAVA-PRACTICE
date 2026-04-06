package DAY6;
import java.util.Scanner;

public class BigofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[10];
        
        // Use 0 for counters
        int evenCount = 0;
        int oddCount = 0;
        int prime = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Enter number " + (i + 1) + ":");
            list[i] = sc.nextInt();
        }

        // Initialize max and min to the first element
        int max = list[0]; 
        int min = list[0];

        for (int item : list) {
            // 1. Check Max
            if (item > max) {
                max = item;
            }
            
            // 2. Check Min
            if (item < min) {
                min = item;
            }

            // 3. Check Even/Odd (Independent of Max/Min)
            if (item % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++;
            }
            
        }

        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        
        sc.close();
    }
}