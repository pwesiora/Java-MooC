import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
           //System.out.print("First name: ");
            String title = scanner.nextLine();
            if (title.isEmpty()){
                break;
            }
            //System.out.print("Identification number: ");
            int pages = Integer.valueOf(scanner.nextLine());
            int publicationYear = Integer.valueOf(scanner.nextLine());

            Book book = new Book(title, pages, publicationYear);
            books.add(book);
        }
        System.out.println("What information will be printed?");
        String query = scanner.nextLine();
        for (Book book: books){
            if (query.equals("everything")){
                System.out.println(book);
            } else if (query.equals("name")){
                System.out.println(book.getName());
            }
        }
    }
}
