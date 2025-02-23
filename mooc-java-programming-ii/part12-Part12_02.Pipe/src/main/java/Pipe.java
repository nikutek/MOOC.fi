
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
public class Pipe<T> {

    private T thing;
    ArrayList<T> things;

    public Pipe() {
        this.things = new ArrayList<T>();
    }

    public void putIntoPipe(T value) {
        things.add(value);
    }

    public T takeFromPipe() {
        if (things.size() == 0) {
            return null;
        }
        T toTake = things.get(0);
        things.remove(0);
        return toTake;
    }

    public boolean isInPipe() {
        return this.things.size() != 0;
    }
}
