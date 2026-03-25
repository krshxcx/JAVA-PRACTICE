import java.util.Scanner;
public class cel2fah {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        while (true) {
             System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble(); // Read Celsius temperature from user
        
        double fahrenheit = (celsius * 9/5) + 32; // Convert to Fahrenheit
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
   
        }
        }
    
}


