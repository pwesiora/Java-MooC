
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                System.out.println("Number of negative numbers: " + num);
                break;
            } else if (input < 0) {
                num = num + 1;
            }
        }
    }
}
