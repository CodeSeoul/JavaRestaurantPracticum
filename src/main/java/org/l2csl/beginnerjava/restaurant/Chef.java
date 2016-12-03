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
        // TODO: Throw an exception if the Chef already has cookware
        // TODO: Set the given cookware to the Chef's cookware. Remove it from the current appliance (if applicable)
        if(this.cookware != null) {
            throw new Exception("The Chef can't carry two pieces of cookware at once!");
        }
        this.cookware = cookware;
        this.cookware.setLocation(null);
    }

    public void put(IAppliance appliance) {
        // TODO: Put the Chef's current cookware into the appliance
    }

    public void put(String ingredientName, int Amount, String State, ICookware cookware) {
        // TODO: Put the Chef's ingredient into the cookware. Remove it from the Chef's ingredients.
    }

    public void put(Ingredient ingredient, ICookware cookware) {
        // TODO: Same as put(String ingredientName, int Amount, String State, ICookware cookware)
    }
}
