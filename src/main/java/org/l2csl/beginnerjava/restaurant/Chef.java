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
        // TODO: Add the ingredient to the Chef's ingredients. If the ingredient is already in his possession, add its amount to what he already has. Don't mix up ingredients of different states!
    }

    public void take(String ingredientName, int amount, String state) {
        // TODO: Same as take(Ingredient ingredient) but for when you don't have an ingredient instance readily available
    }

    public void take(ICookware cookware) {
        // TODO: Throw an exception if the Chef already has cookware
        // TODO: Set the given cookware to the Chef's cookware
    }

    public void put(IAppliance appliance) {
        // TODO: Put the Chef's current cookware into the appliance
    }

    public void put(String ingredientName, int amount, String state, ICookware cookware) {
        // TODO: Put the Chef's ingredient into the cookware. Remove it from the Chef's ingredients.
    }

    public void put(Ingredient ingredient, ICookware cookware) {
        // TODO: Same as put(String ingredientName, int Amount, String State, ICookware cookware)
    }
}
