package DAY_2;
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a year: ");

            // ✅ CHECK FIRST
            if (!sc.hasNextInt()){
                System.out.println("Exiting the program, GOODBYE!");
                break;
            }

            int year = sc.nextInt();

            // ✅ PROPER IF-ELSE
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is NOT a leap year");
            }
        }

        sc.close();
    }
}