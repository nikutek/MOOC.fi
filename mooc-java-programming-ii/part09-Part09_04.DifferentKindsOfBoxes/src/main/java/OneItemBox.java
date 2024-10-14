/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class OneItemBox extends Box {

    private Item itemHeld;

    public OneItemBox() {
    }

    public void add(Item item) {
        if (itemHeld == null) {
            itemHeld = item;
        }
    }

    public boolean isInBox(Item item) {
        if(itemHeld == null){
            return false;
        }
        return itemHeld.equals(item);
    }
}
