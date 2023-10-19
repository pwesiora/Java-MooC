
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
    private JokeManager jokes;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.scanner = scanner;
        this.jokes = jokes;
    }
     public void start(){
        while (true){
            String input;
            System.out.print("Commands:\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop");
            input = scanner.nextLine();
            if (input.equals("X")){
                break;
            }  else if (input.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokes.addJoke(joke);
            } else if (input.equals("2")){
                System.out.println(jokes.drawJoke());
            } else if (input.equals("3")){
                jokes.printJokes();
            }
            //System.out.println("Unknown command");
        }
    }
}
