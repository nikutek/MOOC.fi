
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numsCount = 0;
        int sum =0;
        
        while (true){
            System.out.println("Give a number:");
            int enteredNum = Integer.valueOf(scanner.nextLine());
            
            if (enteredNum ==0){
                break;
            }
            numsCount = numsCount+1;
            sum = sum + enteredNum;
        }
        System.out.println("Average of the numbers: "+ ((double)sum/numsCount));
        
    }
}
