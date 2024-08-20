
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

    private ArrayList list = new ArrayList<>();

    public TodoList() {
    }

    public void add(String task) {
        list.add(task);
    }
    
    public void remove(int idx){
        list.remove(idx);
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ": " + list.get(i));
        }
    }
}
