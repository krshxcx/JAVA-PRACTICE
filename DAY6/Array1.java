package DAY6;
import java.util.ArrayList;
import java.util.Scanner;
public class Array1{
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        int num;
        do {
            System.out.println("enter your number : ");
            num = sc.nextInt();

            List.add(num);
        }
        while ( num != 0);{
            int len = List.size();
            System.out.println(List + "it's length is " + len);
            
        }


        sc.close();
    } 
}