package org.l2csl.java.restaurant.cookware;

import org.l2csl.java.restaurant.Ingredient;
import org.l2csl.java.restaurant.appliance.IAppliance;

import java.util.ArrayList;

/**
 * Created by draco on 11/24/2016.
 */
public abstract class BaseCookware implements ICookware {

    public static final String COLD = "cold";
    public static final String HEATING = "heating";
    public static final String HOT = "hot";

    private String state = COLD;
    private final ArrayList<Ingredient> contents;
    private IAppliance location; // null is the Kitchen

    public BaseCookware() {
        contents = new ArrayList<>();
    }

    public void placeIngredient(Ingredient ingredient) {
        // TODO: Place ingredient into ingredients
    }

    public void removeIngredient(String name) {
        // TODO: Remove the ingredient based on its name
    }

    public void heat() {
        // TODO: If cold, change state to heating
        // TODO: If heating, change state to hot
        // Hint: Use the static finals
    }

    // TODO: Create a getter for the cookware's location
}
