
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String input1 = scanner.nextLine();
            if (input1.isEmpty()) {
                break;
            }
            String book = input1;

            System.out.print("Input the age recommendation: ");
            String input2 = scanner.nextLine();
            int age = Integer.valueOf(input2);
            books.add(new Book(book, age));
        }
        
        System.out.println(books.size() + " books in total.");
        System.out.println("\nBooks:");
        Comparator<Book> comparator = Comparator.comparing(Book::getAge)
                .thenComparing(Book::getTitle);
        Collections.sort(books, comparator);
        books.forEach(p -> System.out.println(p));
    }
}
