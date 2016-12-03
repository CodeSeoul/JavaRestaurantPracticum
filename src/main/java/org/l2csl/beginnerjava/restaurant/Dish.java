package org.l2csl.beginnerjava.restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by draco on 11/24/2016.
 */
public class Dish {
    private final Recipe recipe;
    private Map<String, Ingredient> ingredients;

    public Dish(Recipe recipe) {
        this.recipe = recipe;
        ingredients = new HashMap<>();
    }

    public void addIngredient(Ingredient ingredient) {
        if(ingredients.containsKey(ingredient.getName())) {
            ingredients.get(
                    ingredient.getName()
            ).addPortion(ingredient.getAmount());
        } else {
            ingredients.put(ingredient.getName(), ingredient);
        }
    }

    public void prepare() {
        // TODO: Ensure all of the recipe's ingredients are in the dish. If they are, print that the dish is ready
        for(Ingredient ingredient : recipe.getIngredientList()) {
                
        }
    }
}
