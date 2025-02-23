/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Hideout<T> {

    private T hider;

    public Hideout() {
    }

    public void putIntoHideout(T toHide) {
        if (hider != null) {
            this.hider = toHide;
        }
    }

    public T takeFromHideout() {
        return hider;
    }
    
    public Boolean isInHideout(){
        return this.hider==null;
    }
}
