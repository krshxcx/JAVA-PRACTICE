import java.util.Scanner;
public class ImplicitWidening {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("enter a number :");
            int myInt = sc.nextInt();
            System.out.print("your int is "+ myInt);
            double myDouble = myInt;
            System.out.print(myDouble);
            if (!sc.hasNextDouble()) {
            System.out.println("Not a number, exiting...");
            break;
        }
        }
        sc.close();

    }
}
