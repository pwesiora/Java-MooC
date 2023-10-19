
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        boolean flag = false;
        String searchedFor = scanner.nextLine();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                if (row.equals(searchedFor)){
                    System.out.println("Found!");
                    flag = true;
                    break;
                }
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }
        if (!flag){
            System.out.println("Not found.");
        }
    }
}
