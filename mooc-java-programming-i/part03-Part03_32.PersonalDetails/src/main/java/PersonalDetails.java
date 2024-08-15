
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfYearsOfBorn = 0;
        int numberOfPeople = 0;
        String longestName = "h";
        int oldest = 3000;

        while (true) {
            String person = scanner.nextLine();
            if (person.equals("")) {
                break;
            }

            String[] parts = person.split(",");

            int yearOfBorn = Integer.valueOf(parts[1]);
            sumOfYearsOfBorn += yearOfBorn;
            String name = parts[0];
            numberOfPeople++;

            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sumOfYearsOfBorn / numberOfPeople);

    }
}
