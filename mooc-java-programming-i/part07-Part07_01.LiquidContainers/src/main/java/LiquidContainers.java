
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");            
            
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            if (input.equals("quit")) {
                break;
            }            

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            System.out.println(amount);
            
            if (command.equals("add" ) && amount > 0){
                   firstContainer += amount;
               } else if (command.equals("move") && amount > 0){
                   if(firstContainer < amount){
                       secondContainer += firstContainer;
                       firstContainer = 0;
                   } else {
                       firstContainer -= amount;
                       secondContainer += amount;
                   }
               } else if (command.equals("remove") && amount > 0){
                   secondContainer -= amount;
                   }
               if (secondContainer < 0){
                   secondContainer = 0;
               }
               if (firstContainer < 0){
                   firstContainer = 0;
               }
               if (secondContainer > 100){
                   secondContainer = 100;
               }
               if (firstContainer > 100){
                   firstContainer = 100;
               }


        }
    }

}
