package org.l2csl.beginnerjava.restaurant;

import java.util.ArrayList;

/**
 * Created by draco on 11/24/2016.
 */
public class Dish {
    private final Recipe recipe;
    private ArrayList<Ingredient> ingredients;

    public Dish(Recipe recipe) {
        this.recipe = recipe;
    }

    public void addIngredient(Ingredient ingredient) {
        // TODO: Add the ingredient to the list of ingredients. If the ingredient already exists, just add the amount to the existing ingredient.
    }

    public void prepare() {
        // TODO: Ensure all of the recipe's ingredients are in the dish. If they are, print that the dish is ready
    }
}
