
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest_age = 0;
        String oldest_name = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if (oldest_age < Integer.valueOf(parts[1])) {
                oldest_age = Integer.valueOf(parts[1]);
                oldest_name = parts[0];
            }
        }

        System.out.println("Name of the oldest: " + oldest_name);

    }
}
