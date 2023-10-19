
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        int num = 0;
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0){
                if (num == 0){
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println(sum/num);
                }
                break;
            }
            if (input > 0){
                num = num + 1;
                sum = sum + input;
            }
        }
    }
}
