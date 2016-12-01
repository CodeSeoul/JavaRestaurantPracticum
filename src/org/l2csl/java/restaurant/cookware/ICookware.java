package org.l2csl.java.restaurant.cookware;

import org.l2csl.java.restaurant.Ingredient;
import org.l2csl.java.restaurant.appliance.IAppliance;

/**
 * Created by draco on 11/24/2016.
 */
public interface ICookware {
    void placeIngredient(Ingredient ingredient);
    void removeIngredient(String name);
    void heat();
    IAppliance getLocation();
}
