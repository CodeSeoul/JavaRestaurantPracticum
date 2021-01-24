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
    private IAppliance location;

    public BaseCookware() {
        contents = new HashMap<>();
        location = null; // null is the Kitchen
    }

    public void placeIngredient(Ingredient ingredient) {
    }

    public Ingredient takeIngredient(String name) {
        // TODO: Remove the ingredient from contents based on its name
        return null;
    }

    public void heat() {
        // TODO: If cold, change state to heating
        // TODO: If heating, change state to hot
        // Hint: Use the static finals
    }

    // TODO: Create a getter for the cookware's location
    // TODO: Create a setter for the cookware's location. Make sure to remove the cookware from the IAppliance, too
    // TODO: Create a protected abstract method called getCookState that returns a string
    // TODO: Create a public abstract method called getName that returns a string

    // TODO: Create a method called letCook that returns nothing. If the cookware is hot, it should change all contained ingredients to the cook state returned by getCookState.
}
