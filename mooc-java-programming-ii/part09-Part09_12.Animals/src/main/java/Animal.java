/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
abstract class  Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    
    abstract void eat();
    
    abstract void sleep();

    public String getName(){
        return name;
    }
    
    
}
