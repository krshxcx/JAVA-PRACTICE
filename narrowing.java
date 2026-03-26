import java.util.Scanner;
public class narrowing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("enter a number :");
            if (!sc.hasNextDouble()) {
            System.out.println("Not a number, exiting...");
            break;
}
            double mydouble = sc.nextDouble();
            System.out.println("your int is "+ mydouble);
            int myInt =(int) mydouble;
            System.out.println(myInt);
        }
        sc.close();
    }
}
