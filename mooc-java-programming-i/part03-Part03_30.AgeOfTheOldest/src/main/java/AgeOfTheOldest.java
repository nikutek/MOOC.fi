
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while(true) {
            String person = scanner.nextLine();
            if (person.equals("")){
                break;
            }
            
            String[] parts = person.split(",");
            int age = Integer.valueOf(parts[1]);
            if(age>oldest) {
                oldest = age;
            }
            
        }
        System.out.println("Age of the oldest: "+oldest);

    }
}
