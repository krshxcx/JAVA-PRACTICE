package DAY5;
//REVERSED RIGHT ANGLED TRIANGLE
public class pattern3 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            int num = n;

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num--;
            }

            System.out.println();
        }
    }
}