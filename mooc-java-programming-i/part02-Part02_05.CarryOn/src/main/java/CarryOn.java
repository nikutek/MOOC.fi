
import java.util.Scanner;

public class CarryOn {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        
        while (flag) {
            System.out.println("Shall we carry on?");
            String ans = scanner.nextLine();
            if (ans.equals("no")) {
                flag = false;
            }
        }
        
    }
}
