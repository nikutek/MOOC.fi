
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Warehouse {

    private Map<String, Integer> balance;
    private Map<String, Integer> price;

    public Warehouse() {
        this.balance = new HashMap<>();
        this.price = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.balance.put(product, stock);
        this.price.put(product, price);
    }

    public int price(String product) {
        return price.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return balance.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if (stock(product)==0) {
            return false;
        }
        balance.put(product, stock(product)-1);
        return true;
    }
    
    public Set<String> products(){
        return balance.keySet();
    }
}
