
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

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

        double average = nums.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
        System.out.println("average of the numbers: "+average);
    }
}
