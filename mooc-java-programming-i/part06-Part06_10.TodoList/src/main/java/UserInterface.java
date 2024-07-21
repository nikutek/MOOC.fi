
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class UserInterface {
    private TodoList tasks;
    private Scanner scanner;

    public UserInterface(TodoList tasks, Scanner scanner) {
        this.tasks = tasks;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equals("add")){
                System.out.println("To add:");
                String task = scanner.nextLine();
                tasks.add(task);
            } else if (command.equals("list")){
                tasks.print();
            } else if (command.equals("remove")){
                System.out.println("Wchich one is removed?");
                int idx = Integer.valueOf(scanner.nextLine());
                tasks.remove(idx);
            } else if (command.equals("stop")){
                break;
            }
            
            
        }
    }
    
}
