
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todos = new TodoList();
        UserInterface ui = new UserInterface(todos,scanner);
        
        
        // Here you can try out the combined functionality of your classes
        ui.start();

    }
}
