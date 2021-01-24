package org.l2csl.beginnerjava.restaurant;

/**
 * Created by draco on 11/29/2016.
 */
public class IngredientStore {
    public Ingredient take(String name, int amount) {
        // The ingredient store is magical. It has unlimited ingredients.
        return new Ingredient(name, amount);
    }
}
