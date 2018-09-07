package isajdqz2.books;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Type the author of the book.");
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();

        System.out.println("Type the title of the book.");
        String title = scanner.nextLine();

        System.out.println("How would you describe the book?");
        String description = scanner.nextLine();

        System.out.println("How many pages has the book got?");
        String numOfPages = scanner.nextLine();

        Books book = new Books(author, title, description, numOfPages);
        System.out.println(book.toString());
    }
}
