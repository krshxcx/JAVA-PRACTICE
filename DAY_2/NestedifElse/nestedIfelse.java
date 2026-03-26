package DAY_2.NestedifElse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nestedIfelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> todoList = new ArrayList<>();

        System.out.println("Welcome to the TODO List App!");

        while (true){
            System.out.println("\nEnter: add | show | edit | delete | exit");
            String user_choice = sc.nextLine().toLowerCase();

            if (user_choice.equals("add")){
                System.out.println("Enter the task:");
                String todo = sc.nextLine();
                todoList.add(todo);
                System.out.println("✅ Task added!");

            } else if (user_choice.equals("show")){
                if (todoList.isEmpty()){
                    System.out.println("⚠️ List is empty.");
                } else {
                    System.out.println("Your TODO List:");
                    for (int i = 0; i < todoList.size(); i++){
                        System.out.println((i+1) + ". " + todoList.get(i));
                    }
                }

            } else if (user_choice.equals("edit")){
                if (todoList.isEmpty()){
                    System.out.println("⚠️ Nothing to edit.");
                    continue;
                }

                for (int i = 0; i < todoList.size(); i++){
                    System.out.println((i+1) + ". " + todoList.get(i));
                }

                System.out.println("Enter task number:");
                int index = Integer.parseInt(sc.nextLine());

                if (index < 1 || index > todoList.size()){
                    System.out.println("❌ Invalid index.");
                    continue;
                }

                System.out.println("Enter new task:");
                String newTask = sc.nextLine();
                todoList.set(index - 1, newTask);

                System.out.println("✏️ Task updated!");

            } else if (user_choice.equals("delete")){
                if (todoList.isEmpty()){
                    System.out.println("⚠️ Nothing to delete.");
                    continue;
                }

                for (int i = 0; i < todoList.size(); i++){
                    System.out.println((i+1) + ". " + todoList.get(i));
                }

                System.out.println("Enter task number:");
                int index = Integer.parseInt(sc.nextLine());

                if (index < 1 || index > todoList.size()){
                    System.out.println("❌ Invalid index.");
                    continue;
                }

                todoList.remove(index - 1);
                System.out.println("🗑️ Task deleted!");

            } else if (user_choice.equals("exit")){
                System.out.println("💾 Saving your tasks... Goodbye!");
                break;

            } else {
                System.out.println("❓ Unknown command.");
            }
        }

        sc.close();
    }
}