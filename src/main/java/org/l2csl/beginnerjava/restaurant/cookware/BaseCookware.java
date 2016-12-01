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

    protected final String COOK_STATE = null;

    private String state = COLD;
    private final Map<String, Ingredient> contents;
    private IAppliance location;

    public BaseCookware() {
        contents = new HashMap<>();
        location = null; // null is the Kitchen
    }

    public void placeIngredient(Ingredient ingredient) {
        if(contents.containsKey(ingredient.getName())) {
            contents.get(ingredient.getName()).addPortion(ingredient.getAmount());
        } else {
            contents.put(ingredient.getName(), ingredient);
        }
    }

    public Ingredient takeIngredient(String name) {
        return contents.remove(name);
    }

    public void heat() {
        if(state.equals(COLD)) {
            state = HEATING;
        } else if(state.equals(HEATING)) {
            state = HOT;
        }
    }

    public IAppliance getLocation() {
        // null is the kitchen
        return location;
    }

    public void letCook() {
        for(Ingredient ingredient : contents.values()) {
            ingredient.cook(COOK_STATE);
        }
    }
}
