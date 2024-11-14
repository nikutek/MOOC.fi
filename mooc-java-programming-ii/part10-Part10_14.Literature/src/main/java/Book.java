/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Book implements Comparable<Book>{
    String name;
    int ageRecomendation;

    public Book(String name, int ageRecomendation) {
        this.name = name;
        this.ageRecomendation = ageRecomendation;
    }

    public int getAgeRecomendation() {
        return ageRecomendation;
    }

    public String getName() {
        return name;
    }
    
    

    @Override
    public String toString() {
        return name + " (recomended for " + ageRecomendation + " year-olds or older)";
    }
    
    public int compareTo(Book compared){
        return ageRecomendation - compared.getAgeRecomendation();
    }
}
