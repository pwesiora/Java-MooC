
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("Give a number:");
            String input = scanner.nextLine();
            if (input.equals("0")) {
                System.out.println("Number of numbers: " + num);
                break;
            } else {
                num = num + 1;
            }
        }
    }
}
