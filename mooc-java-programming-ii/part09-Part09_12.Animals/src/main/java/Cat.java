/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Cat extends Animal implements NoiseCapable {

    public Cat() {
        super("Cat");
    }

    public Cat(String name) {
        super(name);
    }

    public void purr() {
        System.out.println(getName() + " purrs");
    }

    public void makeNoise() {
        System.out.println(getName() + " purrs");
    }

    public void eat() {
        System.out.println(getName() + "'s eating");
    }

    public void sleep() {

    }

    public String getName() {
        return name;
    }
}
