package DAY4;
import java.util.Scanner;
public class SumN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the the number to find sum of even 1 -N: ");
        int num = sc.nextInt();
        for (int  i = 2; i <=num; i+=2 ){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}