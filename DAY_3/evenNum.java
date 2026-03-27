package DAY_3;
import java.util.Scanner;
public class evenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter until where you want ecen num: ");
        int num = sc.nextInt();
        int i;
        for (i = 2; i<=num; i+=2){
            System.out.print(i+" ");
        }   
        sc.close();
    }
}
