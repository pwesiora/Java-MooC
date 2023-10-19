import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0, sum = 0, count = 0;
        String longest_name = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if (longest < parts[0].length()) {
                longest = parts[0].length();
                longest_name = parts[0];
            }
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
        }

        System.out.println("Longest name: " + longest_name);
        if (count > 0) {
            System.out.println("Average of the birth years: " + (float)sum/count);
        }
    }
}
