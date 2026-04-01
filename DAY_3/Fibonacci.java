package DAY_3;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter until where you want fib num: ");
        int num = sc.nextInt();
        int prev1 = 0, prev2 =1;
        int i ;
        for( i = 0; i<=num;i++){
            System.out.print(prev1 + " ");
            int next = prev1 + prev2;
            prev1 = prev2;
            prev2 = next;
            
        }
        sc.close();
    }
}
