
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
public class Herd implements Movable {

    private ArrayList<Movable> members;

    public Herd() {
        members = new ArrayList<Movable>();
    }

    public void addToHerd(Movable movable) {
        members.add(movable);
    }

    public String toString() {
        String res = "";
        for (Movable member : members) {
            res += member.toString() + "\n";
        }
        return res;
    }

    public void move(int dx, int dy) {
        for (Movable member : members) {
            member.move(dx, dy);
        }
    }
}
