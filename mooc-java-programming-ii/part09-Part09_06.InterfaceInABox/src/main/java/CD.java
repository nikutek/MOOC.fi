/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CD implements Packable {

    private String artist;
    private String name;
    private int year;
    private double weight;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.weight = 0.1;
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + year + ")"; //To change body of generated methods, choose Tools | Templates.
    }

    public double weight() {
        return weight;
    }

}
