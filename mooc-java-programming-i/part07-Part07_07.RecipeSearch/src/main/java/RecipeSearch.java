import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class RecipeSearch {
 
    public static ArrayList<Recipe> recipes = new ArrayList<Recipe>();
 
    public static void main(String[] args) {
        start();
        controller();
    }
 
    public static void start() {
//        czytanie przepisów z pliku
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String filename = scanner.nextLine();
        try ( Scanner fileScanner = new Scanner(Paths.get(filename))) {
            do {
                String name = fileScanner.nextLine();
                int prepareTime = Integer.valueOf(fileScanner.nextLine());
                Recipe recipe = new Recipe(name, prepareTime);
 
                while (true) {
                    try {
                        String ingredient = fileScanner.nextLine();
                        if (ingredient.equals("")) {
                            break;
                        }
                        recipe.addIngredient(ingredient);
                    } catch (Exception e) {
                        break;
                    }
 
                }
                recipes.add(recipe);
            } while (fileScanner.hasNextLine());
 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
 
    public static void controller() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCommands:\n" +
"list - lists the recipes\n" +
"stop - stops the program\n" +
"find name - searches recipes by name\n" +
"find cooking time - searches recipes by cooking time\n" +
"find ingredient - searches recipes by ingredient");
 
        while (true) {
            System.out.println("\nEnter command: ");
            String command = scanner.nextLine();
 
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String searched = scanner.nextLine();
                System.out.println("\nRecipes:");
                searchByName(searched);
 
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                searchByTime(maxTime);
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("\nRecipes:");
                searchByIngredient(ingredient);
            }
        }
    }
 
    public static void searchByName(String word) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }
 
    }
 
    public static void searchByTime(int maxTime) {
        for (Recipe recipe : recipes) {
            if (recipe.getPrepTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }
 
    public static void searchByIngredient(String ingredient) {
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
 
}