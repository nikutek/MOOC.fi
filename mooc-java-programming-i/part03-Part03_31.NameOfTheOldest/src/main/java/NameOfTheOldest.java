
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name="huj";
        while(true) {
            String person = scanner.nextLine();
            if (person.equals("")){
                break;
            }
            
            String[] parts = person.split(",");
            int age = Integer.valueOf(parts[1]);
            if(age>oldest) {
                oldest = age;
                name=parts[0];
            }
            
        }
        System.out.println("Name of the oldest: "+name);

    }
}
