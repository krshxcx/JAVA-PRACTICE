package DAY4;
import java.util.Scanner;
import java.util.ArrayList;

public class FactorsofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); 
        
        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        System.out.println("Factors of " + n + " are: " + list);
        sc.close();
    } 
}