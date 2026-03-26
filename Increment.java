public class Increment {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("x = " + x);
        // Post-increment
        System.out.println("x++ = " + x++);  // prints 5, THEN x becomes 6
        System.out.println("After x++: x = " + x);  // 6
        x = 5; // reset
        // Pre-increment
        System.out.println("++x = " + (++x));  // x becomes 6 FIRST, prints 6
        System.out.println("After ++x: x = " + x);  // 6
        // The DANGEROUS trap:
        int a = 5;
        int b = a++ + ++a;  // a++ = 5 (a→6), ++a = 7 (a→7), b = 5+7 = 12
        System.out.println("b = a++ + ++a = " + b); // 1
    }
}
