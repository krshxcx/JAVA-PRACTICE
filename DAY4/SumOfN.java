package DAY4;
import java.util.Scanner;
public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int result = 0;     
        while (true) {
            System.out.print("enter  your number or 0 to show sum and exit : ");
            int n = sc.nextInt();

            if (n != 0 ){
                result = result + n;
            }
            else {
                System.out.println(result);
                break;
            }
            
        }
        sc.close();
    }

}
