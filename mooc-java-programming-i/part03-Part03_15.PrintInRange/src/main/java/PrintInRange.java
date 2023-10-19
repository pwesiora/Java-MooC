
import java.util.ArrayList;

public class PrintInRange {
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        System.out.println("The numbers in range: [" + lowerLimit + ", " + upperLimit + "]");
        for (int number: numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
            System.out.println(number);
            }
        }
    }
}
