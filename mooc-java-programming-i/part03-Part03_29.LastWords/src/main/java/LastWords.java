
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }

            String[] words = line.split(" ");
            System.out.println(words[words.length-1]);
        }

    }
}
