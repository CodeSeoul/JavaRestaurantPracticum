package org.l2csl.java.restaurant;

/**
 * Created by draco on 11/24/2016.
 */
public class Recipe {
    private final Ingredient[] ingredientList;
    private final String[] directions; // An array of steps

    public Recipe(Ingredient[] ingredientList, String[] directions) {
        this.ingredientList = ingredientList;
        this.directions = directions;
    }

    public void printIngredients() {
        // TODO: Print each ingredient
    }

    public void printDirections() {
        // TODO: For each value in directions, print the number of the step followed by the step
        // Make this a low priority. It won't have impact on the rest of your code
    }

    // TODO: Create getters for ingredients and directions
}
