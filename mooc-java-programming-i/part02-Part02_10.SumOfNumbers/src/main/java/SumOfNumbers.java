
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while (true){
            System.out.println("Give a number:");
            int enteredNum = Integer.valueOf(scanner.nextLine());
            
            if (enteredNum ==0){
                break;
            }
            sum = sum+enteredNum;
            
        }
        System.out.println("Sum of the numbers: "+sum);
    }
}
