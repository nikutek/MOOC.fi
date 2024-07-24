
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start(){
        while (true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if(command.equals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                dict.add(word, translation);
            } else if (command.equals("search")){
                System.out.println("To be translated:");
                String toTranslate = scanner.nextLine();
                String result = dict.translate(toTranslate);
                if(result==null){
                    System.out.println("Word "+toTranslate+" was not found");
                } else {
                    System.out.println(result);
                }
            } 
            
            else {
                System.out.println("Unknown command");
            }
            
            
        }
    }
    
    
}
