
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
public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int sum = 0;
        for (Item it : items) {
            sum += it.getWeight();
        }
        return sum;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }
    
    public void printItems(){
        for (Item item:items){
            System.out.println(item);
        }
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        
        Item heaviest = items.get(0);
        for (Item item: items){
            if (item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }

    public String toString() {
        if(items.isEmpty()){
            return "no items (0 kg)";
        }
        if(items.size()==1){
            return "1 item (" + totalWeight() + " kg)";
        }
        
        
        return items.size() + " items (" + totalWeight() + " kg)";
    }
}
