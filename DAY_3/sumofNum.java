package DAY_3;
import java.util.Scanner;
public class sumofNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("enter your number:");
            if(!sc.hasNextInt()){
                System.out.println("Goodbye");
                break;
            }
            int num = sc.nextInt();
            int sum = 0;
            while (num>0) {
                int r = num%10;
                sum += r;
                num = num/10;  
            }
            System.out.println(sum);
            
        }
        sc.close();
        

    }
}