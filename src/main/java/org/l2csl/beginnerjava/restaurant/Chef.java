package org.l2csl.beginnerjava.restaurant;

import org.l2csl.beginnerjava.restaurant.appliance.IAppliance;
import org.l2csl.beginnerjava.restaurant.cookware.ICookware;

import java.util.HashMap;

/**
 * Created by draco on 11/24/2016.
 */
public class Chef {
    private HashMap<String, Ingredient> ingredients;
    private ICookware cookware;
    private Kitchen kitchen;

    public Chef() {
        ingredients = new HashMap<>();
        kitchen = Kitchen.getInstance();
    }

    public void take(Ingredient ingredient) {
        Ingredient targetIngredient = ingredients.get(ingredient.getName());
        if(targetIngredient == null) {
            ingredients.put(ingredient.getName(), ingredient);
            return;
        }
        if(targetIngredient.getState().equals(ingredient.getState())) {
            targetIngredient.addPortion(ingredient.getAmount());
        } else {
            System.out.println("It's probably a bad idea to mix differently cooked ingredients.");
        }
    }

    public void take(String ingredientName, int amount, String state) {
        Ingredient ingredient = new Ingredient(ingredientName, amount, state);
        take(ingredient);
    }

    public void take(ICookware cookware) throws Exception {
        if(this.cookware != null) {
            throw new Exception("The Chef can't carry two pieces of cookware at once!");
        }
        this.cookware = cookware;
        this.cookware.setLocation(null);
    }

    public void put(IAppliance appliance) {
        try {
            appliance.placeCookware(cookware);
        } catch(Exception e) {
            System.out.println("Couldn't place the cookware into the appliance! Error was: " +
                e.getMessage());
            return;
        }
        this.cookware = null;
    }

    public void put(String ingredientName, int amount, String state, ICookware cookware) {
        Ingredient ingredient = new Ingredient(ingredientName, amount, state);
        put(ingredient, cookware);
    }

    public void put(Ingredient ingredient, ICookware cookware) {
        cookware.placeIngredient(ingredient);
    }

    public Kitchen getKitchen() {
        return kitchen;
    }
}
