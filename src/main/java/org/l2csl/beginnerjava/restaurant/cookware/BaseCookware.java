package org.l2csl.beginnerjava.restaurant.cookware;

import org.l2csl.beginnerjava.restaurant.appliance.IAppliance;
import org.l2csl.beginnerjava.restaurant.Ingredient;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by draco on 11/24/2016.
 */
public abstract class BaseCookware implements ICookware {

    public static final String COLD = "cold";
    public static final String HEATING = "heating";
    public static final String HOT = "hot";

    private String state = COLD;
    private final Map<String, Ingredient> contents;
    private IAppliance location; // null is the Kitchen

    public BaseCookware() {
        contents = new HashMap<>();
    }

    public void placeIngredient(Ingredient ingredient) {
        if(contents.containsKey(ingredient.getName())) {
            contents.get(ingredient.getName()).addPortion(ingredient.getAmount());
        } else {
            contents.put(ingredient.getName(), ingredient);
        }
    }

    public Ingredient takeIngredient(String name) {
        // TODO: Remove the ingredient based on its name
        return null;
    }

    public void heat() {
        // TODO: If cold, change state to heating
        // TODO: If heating, change state to hot
        // Hint: Use the static finals
    }

    // TODO: Create a getter for the cookware's location

    // TODO: Create a method called letCook that returns nothing. If the cookware is hot, it should change all contained ingredients to the appropriate cooked state.
    // Hint: You can't really change the state here. You should do it in subclasses...
    // Hint: You can created a protected helper method to make things easier. Your subclasses' methods can just be one-liners.
}
