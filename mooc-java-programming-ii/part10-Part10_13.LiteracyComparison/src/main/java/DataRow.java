/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class DataRow implements Comparable<DataRow> {
    String country;
    int year;
    float literacy;
    String gender;

    public DataRow(String country, int year, float literacy, String gender) {
        this.country = country;
        this.year = year;
        this.literacy = literacy;
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public float getLiteracy(float literacy) {
        return this.literacy;
    }

    @Override
    public String toString() {
        return country +" ("+year+"), "+ gender+", "+literacy;
    }
    
    
    
    public int compareTo(DataRow compared){
        if(this.literacy == compared.getLiteracy(literacy)){
            return 0;
        } else if (this.literacy > compared.getLiteracy(literacy)){
            return 1;
        } else {
            return -1;
        }
    }
}
