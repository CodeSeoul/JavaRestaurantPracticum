package org.l2csl.beginnerjava.restaurant.cookware;

import org.l2csl.beginnerjava.restaurant.appliance.IAppliance;
import org.l2csl.beginnerjava.restaurant.Ingredient;

/**
 * Created by draco on 11/24/2016.
 */
public interface ICookware {
    void placeIngredient(Ingredient ingredient);
    Ingredient takeIngredient(String name);
    void heat();
    void letCook();
    IAppliance getLocation();

}
