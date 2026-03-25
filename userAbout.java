import java.util.Scanner;
public class userAbout {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter your favourite Harry Potter or Dark or GOT: ");
            String favourite = sc.nextLine();
            favourite = favourite.toLowerCase(); // Convert to uppercase for case-insensitive comparison

            if (favourite.startsWith("harry potter")){
                System.out.println(name + " Hello, Potter head!");
            }
            else if (favourite.startsWith("dark")){
                System.out.println(name + ", sure we will meet in the end of the beginning");
            }
            else if (favourite.startsWith("got")){
                System.out.println(name + ", Wannabe Dragon parent ?");
            }
            else {
                System.out.println("Your favourite is not in the list");
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            
        }
    }
    
}
