
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String oneLine = scanner.nextLine();
            if(oneLine.equals("")){
                break;
            }
            
            String[] words = oneLine.split(" ");
            for (String word : words) {
            System.out.println(word);
        }
        }

        
    }
}
