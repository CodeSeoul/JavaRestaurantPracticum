package org.l2csl.beginnerjava.restaurant.cookware;

import org.l2csl.beginnerjava.restaurant.Ingredient;

/**
 * Created by draco on 11/24/2016.
 */
public class Pan extends BaseCookware {
    protected final String COOK_STATE = Ingredient.SAUTEED;

    @Override
    public String getName() {
        return "pan";
    }

    public String getCookState() { return COOK_STATE; }
}
