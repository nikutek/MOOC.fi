/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public enum Education {
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");
//    PHD,MA,BA,HS;
    private String education;

    private Education(String education) {
        this.education = education;
    }

    public String getEducation() {
        return education;
    }
    
    public String toString(){
        return name();
    }
}
