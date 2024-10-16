
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> rows = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();

            if (row.equals("")) {
                break;
            }
            rows.add(row);
        }

        rows.stream()
                .forEach(s -> System.out.println(s));
    }
}
