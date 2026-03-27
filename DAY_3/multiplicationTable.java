package DAY_3;
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("MULTIPLICATION TABLE");
    while(true){
        System.out.print("Enter a number to see multiplication table: ");
        if(!sc.hasNextInt()){
            System.out.println("not a number: GOODBYE!");
            break;
        }
        int int1 = sc.nextInt();
        int i;
        for (i =1; i<=10;i++){
            System.out.println(int1 + " * " + i + " = " + (int1 * i));
        }
    sc.close();
    }
}
}