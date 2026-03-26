import java.util.Scanner;
public class AreaRect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter length of the rectangle: ");
        int length = sc.nextInt(); // Read length from user
        System.out.print("Enter breadth of the rectangle: ");   
        int breadth = sc.nextInt(); // Read breadth from user
        
        int area = length * breadth; // Calculate area of rectangle
        System.out.println("Area of the rectangle: " + area);

        int perimeter = 2 * (length + breadth); // Calculate perimeter of rectangle
        System.out.println("Perimeter of the rectangle: " + perimeter);
            sc.close();
        }
    }
}
