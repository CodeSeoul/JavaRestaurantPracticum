package org.l2csl.beginnerjava.restaurant;

/**
 * Created by draco on 11/24/2016.
 */
public class Recipe {
    private final Ingredient[] ingredientList;
    private final String[] directions; // An array of steps
    private final String name;

    public Recipe(String name, Ingredient[] ingredientList, String[] directions) {
        this.name = name;
        this.ingredientList = ingredientList;
        this.directions = directions;
    }

    public void printIngredients() {
        for(Ingredient ingredient : ingredientList) {
            System.out.println(ingredient.toString());
        }
    }

    public void printDirections() {
        for(int i = 0; i < directions.length; i++) {
            System.out.println(Integer.toString(i) + ") " + directions[i]);
        }
    }

    public Ingredient[] getIngredientList() {
        return ingredientList;
    }

    public String[] getDirections() {
        return directions;
    }

    public String getName() { return name; }
}
