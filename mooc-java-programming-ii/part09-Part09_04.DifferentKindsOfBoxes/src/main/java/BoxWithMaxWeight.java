
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
public class BoxWithMaxWeight extends Box {

    private int MaxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        items = new ArrayList<>();
        this.MaxWeight = capacity;
    }

    public void add(Item item) {
        int capacityUsed=0;
        for (Item obj : items) {
            capacityUsed += obj.getWeight();
        }
        if (capacityUsed + item.getWeight() <= MaxWeight) {
            items.add(item);
        }
        int sum = 0;

    }

    public boolean isInBox(Item item) {
        return items.contains(item);

    }
}
