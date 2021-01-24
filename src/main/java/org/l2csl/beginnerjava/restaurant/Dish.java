package org.l2csl.beginnerjava.restaurant;

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
        this.ingredients = new HashMap<>();
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
        // TODO: For each ingredient in the recipe, check if that ingredient is in the dish
        // TODO: If an ingredient from the recipe is not in the dish, print that an ingredient is missing and return
        // TODO: If all of the recipe ingredients have been looped through without ending early, print that the dish is ready
    }
}
