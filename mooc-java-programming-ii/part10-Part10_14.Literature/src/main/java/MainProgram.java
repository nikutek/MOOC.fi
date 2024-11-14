
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();

            if (bookName.equals("")) {
                break;
            }

            System.out.println("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookName, ageRec));
        }

        Comparator<Book> comparator = Comparator.comparing(Book::getAgeRecomendation).thenComparing(Book::getName);

        System.out.println(books.size() + " books in total. \n");
        System.out.println("Books:");
//        books.stream().sorted().forEach(b -> System.out.println(b));
        Collections.sort(books, comparator);
        for (Book book : books){
            System.out.println(book);
        }
    }

}
