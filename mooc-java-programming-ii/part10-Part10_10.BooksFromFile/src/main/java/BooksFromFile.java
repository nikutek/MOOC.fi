
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        readBooks("books.txt");

    }

    public static List<Book> readBooks(String file) {
        ArrayList<Book> books = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(b -> {
                        String[] line = b.split(",");
                        String name = line[0];
                        int publishingYear = Integer.valueOf(line[1]);
                        int pages = Integer.valueOf(line[2]);
                        String author = line[3];
                        Book book = new Book(name, publishingYear, pages, author);
                        return book;
                    })
                    .forEach(b -> books.add(b));

        } catch (Exception e) {
            System.out.println(e);
        }
        return books;
    }

}
