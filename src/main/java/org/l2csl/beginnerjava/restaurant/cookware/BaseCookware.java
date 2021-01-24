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
    public IAppliance location;

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
            System.out.println("The " + getName() + " is now HEATING");
        } else if(state.equals(HEATING)) {
            state = HOT;
            System.out.println("The " + getName() + " is now HOT");
        }
    }

    public IAppliance getLocation() {
        // null is the kitchen
        return location;
    }

    public void setLocation(IAppliance location) {
        if(location != null) {
            location.takeCookware(getName());
        }
        this.location = location;
    }

    public void letCook() {
        if(state.equals(HOT)) {
            for (Ingredient ingredient : contents.values()) {
                ingredient.cook(getCookState());
                System.out.println(ingredient.getName() + " is now " + getCookState());
            }
        } else {
            System.out.println("Cookware is not hot yet. Please heat it more.");
        }
    }

    public String getName() {
        return "DO NOT USE";
    }

    protected abstract String getCookState();
}
