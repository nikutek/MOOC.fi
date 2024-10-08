
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Room {
    private ArrayList<Person> people = new ArrayList<>();

    public Room() {
    }
    
    public void add(Person person){
        people.add(person);
    }
    
    public boolean isEmpty(){
        return people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return people;
    }
    
    public Person shortest() {
        if(people.isEmpty()){
            return null;
        }
        
        Person shortest = people.get(0);
        for (Person per: people){
            if(per.getHeight()< shortest.getHeight()){
                shortest = per;
            }
        }
        return shortest;
    }
    
    public Person take(){
        if (people.isEmpty()){
            return null;
        }
        Person shortest = shortest();
        people.remove(shortest);
        return shortest;
    }
}
