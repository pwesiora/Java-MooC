/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class Recipe {
    
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
   
    public Recipe(String recipeName, int cookingTime) {
        this.name = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }    
    
    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
    
}
