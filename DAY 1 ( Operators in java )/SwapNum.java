import java.util.Scanner;
public class SwapNum {
    public static void main(String[] args){
            while (true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter first number: ");
                int num1 = sc.nextInt();
                System.out.println("Enter second number: ");
                int num2 = sc.nextInt();
    
                System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
    
                // Swapping Logic
    
                num1 = num1+num2;
                num2 = num1-num2;
                num1 = num1-num2;
    
                System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
                sc.close();
            }
        }
}

