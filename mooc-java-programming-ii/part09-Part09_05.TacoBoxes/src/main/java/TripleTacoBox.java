/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class TripleTacoBox implements TacoBox {
    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }
    
    public int tacosRemaining(){
        return tacos;
    }
    
    public void eat(){
        if(tacos>0){
            tacos = tacos-1;
        }
    }

}
