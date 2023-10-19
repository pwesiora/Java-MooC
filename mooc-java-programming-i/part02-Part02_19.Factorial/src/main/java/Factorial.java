
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int end = Integer.valueOf(scanner.nextLine());
        int fact = 1;
        if (end == 0){
            System.out.println("The factorial is 1");
        }
        for (int i = 1; i <= end; i++){
            fact = fact * i;
        }
        System.out.println("The factorial is " + fact);
    }
}
