
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String stringVar = scan.nextLine();
        System.out.println("Give an integer:");
        int intVar = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doubleVar = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean boolVar = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + stringVar);
        System.out.println("You gave the integer " + intVar);
        System.out.println("You gave the double " + doubleVar);
        System.out.println("You gave the boolean " + boolVar);
        // write your program here

    }
}
