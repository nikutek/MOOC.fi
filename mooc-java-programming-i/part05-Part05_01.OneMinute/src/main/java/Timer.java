/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Timer {
    private ClockHand hundreths = new ClockHand(100);
    private ClockHand seconds = new ClockHand(60);
    
    public Timer(){
        
    }
    
    public String toString(){
        return this.seconds +":"+this.hundreths;
    }
    
    public void advance(){
        if(this.hundreths.value()==99){
            this.seconds.advance();
        }
        this.hundreths.advance();
    }
}
