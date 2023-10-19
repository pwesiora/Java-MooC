
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Archive> items = new ArrayList<>();
        
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String ident = scanner.nextLine();
            if (ident.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Archive item = new Archive(name, ident);
            if (!items.contains(item)){
                System.out.println(items.contains(item));
                items.add(item);
                }
            }
        for (Archive retrieved: items){
            System.out.println(retrieved);
            }
    }
}
