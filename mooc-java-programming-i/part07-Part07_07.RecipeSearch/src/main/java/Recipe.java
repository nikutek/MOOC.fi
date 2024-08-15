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
public class Recipe {
   private String name;
   private int prepTime;
   private ArrayList<String> ingredients;
 
    public Recipe(String name, int prepTime, ArrayList ingredients) {
        this.name = name;
        this.prepTime = prepTime;
        this.ingredients = ingredients;
    }
   
   public Recipe(String name, int prepTime){
       this.name = name;
       this.prepTime = prepTime;
       this.ingredients = new ArrayList<String>();
   } 
   
   public void addIngredient(String name) {
       this.ingredients.add(name);
   }
   
   public String toString(){
//       String ingredients = "";
//       for (String ing : this.ingredients){
//           ingredients+= ing+" ";
//       }
       return name + ", cooking time: " + prepTime+".";
   }
 
    public String getName() {
        return name;
    }
 
    public int getPrepTime() {
        return prepTime;
    }
 
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
   
    
   
}