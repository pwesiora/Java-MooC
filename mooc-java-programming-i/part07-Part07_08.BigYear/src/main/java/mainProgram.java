
import java.util.Scanner;

public class mainProgram {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BirdManager birdManager = new BirdManager();
        while (true) {
            System.out.print("? ");
            String userCommand = scan.nextLine();
            
            switch (userCommand) {
                case "All":
                    birdManager.printAllBirds();
                    break;
                case "Add": 
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Latin name: ");
                    String latinName = scan.nextLine();
                    birdManager.addBird(name, latinName);
                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    name = scan.nextLine();
                    birdManager.addObservationToBird(name);
                    break;
                case "One":
                    System.out.print("Bird? ");
                    name = scan.nextLine();
                    birdManager.printOneBird(name);
                    break;
                case "Quit":
                    return;
            }
        }
    }  
}