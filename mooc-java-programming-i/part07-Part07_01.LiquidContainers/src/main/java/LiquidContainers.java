
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container(0, 100);
        Container second = new Container(0, 100);

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts.length == 1) {
                if (input.equals("quit")) {
                    break;
                }
            }
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (input.equals("quit")) {
                return;
            } else if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                first.move(second, amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            }

        }

    }
}
