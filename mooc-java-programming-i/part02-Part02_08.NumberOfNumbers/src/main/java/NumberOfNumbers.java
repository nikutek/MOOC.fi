
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numsCount = 0;
        
        while (true){
            System.out.println("Give a number:");
            int enteredNum = Integer.valueOf(scanner.nextLine());
            
            if (enteredNum ==0){
                break;
            }
            numsCount = numsCount+1;
            
        }
        System.out.println("Number of numbers: "+numsCount);
    }
}
