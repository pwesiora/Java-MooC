
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList todo;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.scanner = scanner;
        this.todo = todo;
    }
     public void start(){
        while (true){
            String input;
            System.out.println("Command:");
            input = scanner.nextLine();
            if (input.equals("stop")){
                break;
            }  else if (input.equals("add")){
                System.out.println("To add::");
                String task = scanner.nextLine();
                todo.add(task);
            } else if (input.equals("remove")){
                System.out.println("Which one is removed?");
                todo.remove(Integer.valueOf(scanner.nextLine()));
            } else if (input.equals("list")){
                todo.print();
            }
            //System.out.println("Unknown command");
        }
    }
}
