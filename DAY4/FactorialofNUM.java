package DAY4;
import java.util.Scanner;

public class FactorialofNUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to find factorial of num :");
        int num = sc.nextInt();
        int fact = 1;
        for (int i =1; i <= num; i++ ){
            fact = fact*i;
            
        }
        System.out.println(fact);
        sc.close();
    }
}
