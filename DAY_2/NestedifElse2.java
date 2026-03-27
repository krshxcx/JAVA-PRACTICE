package DAY_2;
import java.util.Scanner;

public class NestedifElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter your first number: ");
            int num = sc.nextInt();
            System.out.println("Enter your second number;");
            int num2 = sc.nextInt();

            if (num > num2) {
                System.out.println(num + " is greater than " + num2);
            } else if (num == num2) {
                System.out.println("Both numbers are equal.");  
                
            }  
            else if (!sc.hasNextInt()){
                break;
            }
             else {
                
                System.out.println(num2 + " is greater than " + num);
            }
        }
        sc.close();
    }
}
