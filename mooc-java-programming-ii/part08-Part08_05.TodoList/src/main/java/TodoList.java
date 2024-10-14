
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class TodoList {
    private ArrayList<String> todos;

    public TodoList() {
        this.todos = new ArrayList <String>();
    }
    
    public void add(String task){
        todos.add(task);
    }
    
    public void remove(int number){
        todos.remove(number-1);
    }
    
    public void print(){
        int idx = 1;
        for(String todo: todos){
            System.out.println(idx+": "+todo);
            idx++;
        }
    }
    
    
    
    
}
