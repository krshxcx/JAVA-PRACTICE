package DAY4;

import java.util.Scanner;

public class DigitsR2L {
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int n = Math.abs(sc.nextInt());
            System.out.print("Digits (right to left): ");
            while (n > 0) {
            System.out.print((n % 10) + " ");  // last digit
            n /= 10;
            }
            sc.close();
}
}
