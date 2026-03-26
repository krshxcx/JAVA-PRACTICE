package DAY_2;
import java.util.Scanner;

public class Ternarny2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number A: ");
            int num1 = sc.nextInt();
            System.out.print("Enter a number B: ");
            int num2 = sc.nextInt();

            int big = (num1 > num2) ? num1 : num2;
            System.out.println("The bigger number is " + big );

            }
    }
}
