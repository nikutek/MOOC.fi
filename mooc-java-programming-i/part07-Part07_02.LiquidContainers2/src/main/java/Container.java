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

    private int capacity;
    private int maxCapacity;

    public Container() {
        this.capacity = 0;
        this.maxCapacity = 100;
    }
    
    public int contains(){
        return this.capacity;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        this.capacity += amount;
        if (capacity > 100) {
            this.capacity = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        this.capacity -= amount;
        if (this.capacity < 0) {
            this.capacity = 0;
        }
    }

    public void move(Container destination, int amount) {
        if (amount < 0) {
            return;
        } else if (this.capacity < amount) {
            destination.add(this.capacity);
            this.remove(amount);
            return;
        }
        this.remove(amount);
        destination.add(amount);
    }

    public String toString() {
        return this.capacity + "/" + this.maxCapacity;
    }
}
