
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int divider=0;
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num==0){
                break;
            } else if (num <0){
                continue;
            }
            sum+=num;
            divider++;
        }
        
        if (sum==0){
            System.out.println("Cannot calculate the average");
            return;
        }
        
        System.out.println(1.0 * sum / divider);
    }
}
