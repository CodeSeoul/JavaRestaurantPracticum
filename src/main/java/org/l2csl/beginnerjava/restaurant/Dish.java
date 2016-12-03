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
        for(Ingredient ingredient : recipe.getIngredientList()) {
            Ingredient targetIngredient = ingredients.get(ingredient.getName());
            if(targetIngredient == null) {
                System.out.println("Missing ingredient " + ingredient.getName());
                return;
            }
            if(!targetIngredient.getState().equals(ingredient.getState())) {
                System.out.println(targetIngredient.getName() +
                        " is currently " + targetIngredient.getState() +
                        " but it must be " + ingredient.getState());
                return;
            }
        }
        System.out.println("The " + recipe.getName() + " dish is ready!");
    }
}
