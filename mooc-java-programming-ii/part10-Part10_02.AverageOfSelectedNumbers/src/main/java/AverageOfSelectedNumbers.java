
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nums = new ArrayList<String>();
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String num = scanner.nextLine();

            if (num.equals("end")) {
                break;
            }
            nums.add(num);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String res = scanner.nextLine();
        if (res.equals("p")) {
            double average = nums.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        } else if (res.equals("n")) {
            double average = nums.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }

    }
}
