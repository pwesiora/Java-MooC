import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Register register = new Register();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points >= 0 && points <= 100) {
                register.addScore(points);
            }
        }
        int limit = 50;
        System.out.println("Point average (all): " + register.averageOfPoints(null));
        System.out.println("Point average (passing): " + register.averageOfPoints(limit));
        System.out.println("Pass percentage: " + register.passPercentage(limit));
        
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.print("\n");

            grade--;
        }
    }
}