package DAY_2;
import java.util.Scanner;
public class Ternary3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("welcome, enter number to continue and any other key to exit");

       while (true) {
        System.out.print("Enter your number: ");
        if(!sc.hasNextInt()){
            System.out.println("exiting the code: Goodbye");
            break;
        }

        int num  = sc.nextInt();
         String result = (num > 0 ) ? "positive" : (num <0 ) ? "negative" : "zero";
        System.out.println(result);
       }
       sc.close();
        }
}
