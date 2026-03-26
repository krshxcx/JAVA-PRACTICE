// import java.util.Scanner;

// public class ChartoASCI {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a character OR number: ");
//         String input = sc.next();

//         // If it's a single letter → char to ASCII
//         if (input.length() == 1 && !Character.isDigit(input.charAt(0))) {
//             char ch = input.charAt(0);
//             System.out.println("ASCII: " + (int) ch);
//         } 
//         // Otherwise → number to char
//         else {
//             int num = Integer.parseInt(input);
//             System.out.println("Character: " + (char) num);
//         }
//     }
// }


import java.util.Scanner;

public class ChartoASCI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for char → ASCII");
        System.out.println("Enter 2 for number → char");
        System.out.println("Enter 3 for exit");

        int choice = sc.nextInt();

       while (true) {
         if (choice == 1){
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);

            int ascii = ch;
            System.out.println("ASCII value: " + ascii);
        }

        else if (choice == 2){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            char ch = (char) num;
            System.out.println("Character: " + ch);
        }

        else if (choice == 3){
            System.out.println("exiting... goodbye");
            break;
        }

        else{
            System.out.println("Wrong choice");
        }
        sc.close();
       }
    }
}