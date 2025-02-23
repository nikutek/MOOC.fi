
import java.util.NoSuchElementException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class List<T> {

    private T[] things;
    private int fristFreeIndex;

    public List() {
        this.things = (T[]) new Object[10];
        this.fristFreeIndex = 0;
    }

    public T get(int index) {
        if (index > this.size()) {
            return null;
        }
        return this.things[index];
    }

    public void add(T thingToAdd) {
        if (this.fristFreeIndex == this.size()) {
            this.grow();
        }
        this.things[this.fristFreeIndex] = thingToAdd;
        this.fristFreeIndex++;
    }

    public boolean contains(T obj) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public void remove(T obj) {
        int indexOfObj = -1;
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).equals(obj)) {
                indexOfObj = i;
            }
        }
        if (indexOfObj == -1) {
            throw new NoSuchElementException("No such Element");
        }
//        Shifting all items after the deleted one to the left by one
        for (int i = indexOfObj; i < this.size(); i++) {
            this.things[i] = this.things[i + 1];
        }
        this.fristFreeIndex--;
    }

    private void grow() {
        int newSize = this.things.length + this.things.length/2;
        T[] newArray = (T[]) new Object[newSize];

        for (int i = 0; i < this.size(); i++) {
            newArray[i] = this.get(i);
        }

        this.things = newArray;
    }

    public int size() {
        return this.fristFreeIndex;
    }

}
