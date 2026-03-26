package DAY_2;
import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your marks: ");
            int marks = sc.nextInt();

            if (marks >= 35) {
                System.out.println("Congratulations! You have passed.");
                if (marks >= 75) {
                    System.out.println("You have passed with distinction.");
                } else if (marks >= 60) {
                    System.out.println("First class");
                } else if (marks >= 50) {
                    System.out.println("Second class");
                } else {
                    System.out.println("Third class");
                }
            } else {
                System.out.println("Sorry! You have failed.");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String choice = sc.next();
            if (choice.startsWith("yes")) {
                continue;
            } else {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
        }
    
    }

}
