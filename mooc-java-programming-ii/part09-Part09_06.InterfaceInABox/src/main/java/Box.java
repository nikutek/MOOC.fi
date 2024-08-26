
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
public class Box implements Packable{

    private ArrayList<Packable> items = new ArrayList<>();
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Box: "+items.size()+" items, total weight "+weight()+" kg";
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() > maxCapacity){
            return;
        }
        items.add(packable);
    }

    public double weight() {
        double weight = 0;
        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }

}
