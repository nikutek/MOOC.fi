
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container c1 = new Container();
        Container c2 = new Container();

        while (true) {
            System.out.println("First: " + c1);
            System.out.println("Second: " + c2);
            String input = scan.nextLine();
            System.out.println("");
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int arg = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {
                c1.add(arg);
            } else if (parts[0].equals("move")) {
                c1.move(c2, arg);
            } else if (parts[0].equals("remove")) {
                c2.remove(arg);
            }

        }

    }

}
