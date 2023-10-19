
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    public void start(){
        while (true){
            String input;
            System.out.println("Command:");
            input = scanner.nextLine();
            if (input.equals("end")){
                System.out.println("Bye bye!");
                break;
            }  else if (input.equals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                dict.add(word, translation);
            } else if (input.equals("search")){
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                String translation = dict.translate(word);
                if (translation == null){
                    System.out.println("Word " + word + " was not found");
                } else{
                    System.out.println("Translation:");
                    System.out.println(translation);                   
                }
            }
            System.out.println("Unknown command");
        }
    }
}
