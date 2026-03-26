package DAY_2.NestedifElse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nestedIfelse {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        List<String> todoList = new ArrayList<>();
        System.out.println("Welcome to the TODO List App!");
        while (true){
            System.out.println("Enter add or close or edit or delte or exit:");
            String user_choice = sc.nextLine();
            if (user_choice.equals("add")){
                System.out.println("Enter the task you want to add:");
                String Todo = sc.nextLine();
                todoList.add(Todo);
                System.out.println("Task added successfully!");
            }

            else if (user_choice.equals("show")){
                System.out.println("Your TODO LIst:");
                for (int i = 0; i<todoList.size(); i++){
                    System.out.println(i+1 +"." +todoList.get(i));
                }
            }

            else if (user_choice.endsWith("edit")){
                for (int i = 0; i<todoList.size(); i++){
                    System.out.println(i+1 +"." +todoList.get(i));
                }
                System.out.println("Enter the index of the task you want to edit:");
                int index = sc.nextInt();
                System.out.println("Enter the new task:");
                sc.nextLine(); // Consume the newline character
                String new_task = sc.nextLine();
                String todoslist = todoList.set(index - 1, new_task);
                System.out.println("Task updated successfully!");

            }
            else if (user_choice.equals("exit") || user_choice.equals("close")) {
                System.out.println("Saving your tasks... Goodbye!");
                break; // This immediately shatters the while loop and ends the program
            }
            }
        }
} 
