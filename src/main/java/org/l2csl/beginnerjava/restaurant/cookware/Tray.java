package org.l2csl.beginnerjava.restaurant.cookware;

import org.l2csl.beginnerjava.restaurant.Ingredient;

/**
 * Created by draco on 11/24/2016.
 */
public class Tray extends BaseCookware {
    protected final String COOK_STATE = Ingredient.BAKED;

    @Override
    public String getName() {
        return "tray";
    }
}
