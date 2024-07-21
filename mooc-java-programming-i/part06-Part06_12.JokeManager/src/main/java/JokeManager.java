
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<String>();
    }
    
   public void addJoke(String joke){
       jokes.add(joke);
   }
   
   public String drawJoke(){
       if (jokes.isEmpty()){
           return "Jokes are in short supply.";
       }
       Random rand = new Random();
       return jokes.get(rand.nextInt(jokes.size()));
   }
   
   public void printJokes(){
       for (String joke : jokes){
           System.out.println(joke);
       }
   }
    
}
