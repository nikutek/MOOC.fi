
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
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<Double>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        double max = 0;
        for (double val : history) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
    
    public double minValue(){
        if(history.size()==0){
            return 0;
        }
        double min = 999999999999999.9;
        for (double val : history){
            if (val < min){
                min = val;
            }
        }
        return min;
    }
    
    public double average(){
        double sum = 0;
        for (double val : history){
            sum+=val;
        }
        return sum/history.size();
    }

    public String toString() {
        return history.toString();
    }

}
