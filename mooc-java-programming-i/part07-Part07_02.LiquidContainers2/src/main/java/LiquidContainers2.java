
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);            
            
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            if (input.equals("quit")) {
                break;
            }            

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            System.out.println(amount);
            
            if (command.equals("add")){
                   firstContainer.add(amount);
               } else if (command.equals("move") && amount > 0){
                   if(firstContainer.contains() < amount){
                       secondContainer.add(firstContainer.contains());
                       firstContainer.remove(firstContainer.contains());
                   } else {
                       firstContainer.remove(amount);
                       secondContainer.add(amount);
                   }
               } else if (command.equals("remove")){
                   secondContainer.remove(amount);
                   }
        }
    }

}
