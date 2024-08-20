
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class IOU {

    private HashMap<String, Double> IOUs;

    public IOU() {
        IOUs = new HashMap<>();
    }

    public double howMuchDoIOweTo(String toWhom) {
        return IOUs.getOrDefault(toWhom, 0.0);
    }

    public void setSum(String toWhom, double amount) {
        IOUs.put(toWhom, amount);
    }
}
