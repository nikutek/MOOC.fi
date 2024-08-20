/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Container {
    int amount;

    public Container() {
        amount = 0;
    }

    public String toString() {
        return amount + "/100";
    }

    public int contains() {
        return amount;
    }

    public void update() {
        if (amount < 0) {
            amount = 0;
        } else if (amount > 100) {
            amount = 100;
        }
    }

    public void add(int liters) {
        if (liters<=0){
            return;
        }
        amount += liters;
        update();
    }
    
    public void move(Container target, int liters){
        if(liters <=0){
            return;
        } else if(this.amount <liters){
            target.add(amount);
            this.remove(amount);
            return;            
        }
        this.remove(liters);
        target.add(liters);
        
        this.update();
        target.update();
        
    }
    
    public void remove(int liters){
        if (liters<=0){
            return;
        }
        amount -= liters;
        update();
    }

}