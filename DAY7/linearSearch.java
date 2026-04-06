package day7;
import java.util.Scanner;


public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 3, 5, 7, 9, 11, 13};
        int n = a.length;
        boolean found = false;
        while (true){
            for (int num : a) {
         System.out.print(num + " ");
        }
        System.out.println(); 
        
        System.out.print("enter your number : ");
        int x = sc.nextInt();
         if (x == 0){
            break;
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.println(x + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(x + " not found in the array");
        }
    }
    sc.close();
    }
}
