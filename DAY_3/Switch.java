package DAY_3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vowel checker");

        while (true) {
            System.out.print("Enter your character: ");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("You entered nothing 🤨");
                continue;
            }

            char character = input.charAt(0);
            String result;
            
            if (Character.isLetter(character)) {    
                
                result = switch (character) {
                    case 'a', 'e', 'i', 'o', 'u',
                         'A', 'E', 'I', 'O', 'U' -> "Vowel";
                    default -> "Consonant";
                };
            } 
            else {
                result = "Not a letter, might be a symbol or number!, UNTA MARI BYE" ;
                break;
            }

            System.out.println(result);
        }
        sc.close();
    }
}