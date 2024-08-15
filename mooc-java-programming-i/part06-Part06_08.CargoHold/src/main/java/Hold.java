
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> held = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            held.add(suitcase);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Suitcase sc : held) {
            sum += sc.totalWeight();
        }
        return sum;
    }
    
    public void printItems(){
        for (Suitcase sc: held){
            sc.printItems();
        }
    }

    @Override
    public String toString() {

        return held.size() + " suitcases (" + totalWeight() + " kg)"; //To change body of generated methods, choose Tools | Templates.
    }

}
