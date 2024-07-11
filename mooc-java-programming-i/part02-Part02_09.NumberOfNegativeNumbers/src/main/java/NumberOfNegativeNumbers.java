
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numsCount = 0;

        while (true) {
            System.out.println("Give a number:");
            int enteredNum = Integer.valueOf(scanner.nextLine());

            if (enteredNum == 0) {
                break;
            } else if (enteredNum > 0) {
                continue;
            }
            numsCount=numsCount+1;
        }
        System.out.println("Number of negative numbers: " + numsCount);
    }
}
