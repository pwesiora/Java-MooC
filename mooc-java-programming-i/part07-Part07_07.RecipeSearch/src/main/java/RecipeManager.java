/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
    
    private ArrayList<String> ingredients;
    private ArrayList<Recipe> recipes;
    
    public RecipeManager() {
        this.ingredients = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }
    
    public void readRecipe(String fileName) {
        try (Scanner input = new Scanner(new File(fileName))) {
            while (input.hasNextLine()) {
                String recipeName = input.nextLine();
                int cookingTime = Integer.valueOf(input.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);
                recipes.add(recipe);
                while (input.hasNextLine()) {
                    String ingredient = input.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }  
                    recipe.addIngredients(ingredient);
                }            
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void listRecipes() {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
    
    public void printNames(String nameToSearch) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(nameToSearch)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void printCookingTime(int maxCookingTime) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }   
    
    public void printIngredients(String ingredient) {
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getIngredients().contains(ingredient)) {
                System.out.println(recipes.get(i));
            }
        }
    }
}
