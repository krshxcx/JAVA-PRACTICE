package DAY4;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        do {
            int randomNumber = rand.nextInt(10) + 1;

            System.out.print("Enter your number: ");
            int my_num = sc.nextInt();

            if (my_num == randomNumber) {
                System.out.println("Yes! Guessed it right: " + my_num);

                System.out.print("Wanna continue? (y/n): ");
                char choice = sc.next().charAt(0);

                if (choice == 'y' || choice == 'Y') {
                    continue;
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong guess, try again!");
            }

        } while (true);

        sc.close();
    }
}