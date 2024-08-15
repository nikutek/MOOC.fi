
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 1;
        
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        
        for (int i=1;i<=num;i++){
            res*=i;
        }
        System.out.println(res);
    }
}
