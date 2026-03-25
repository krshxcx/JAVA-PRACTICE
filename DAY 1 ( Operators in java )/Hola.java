import java.util.Scanner;

public class Hola {
    public static void main(String[] args) {
        // 1. Move Scanner outside the loop
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Calculator ---");
            System.out.println("Enter operator (+, -, *, /) or any other key to EXIT: ");
            char operator = sc.next().charAt(0);

            // 2. Check for exit immediately so we don't ask for numbers needlessly
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("Exiting the program. Goodbye!");
                break; 
            }

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            int result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
            }
        }
        
        sc.close(); // 3. Good practice to close the scanner when the loop ends
    }
}