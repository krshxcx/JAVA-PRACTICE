/* Ternary Operator Example */

/* In java, the ternary operator is a shorthand way to write an if-else statement. It has the following syntax:
 * condition ? value_if_true : value_if_false

Syntax :
test-expression ? statement1(True statement) : statement2(False statement)
 */

package DAY_2;
import java.util.Scanner;
public class Ternary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            String result = (num %2 == 0)? "even" : "odd";
            System.out.println("The number is " + result);
            if(!sc.hasNextInt()){
                System.out.println("Ayipoyindi pooo inga");
                break;
            }
            }
    sc.close();  
    }
  
}



