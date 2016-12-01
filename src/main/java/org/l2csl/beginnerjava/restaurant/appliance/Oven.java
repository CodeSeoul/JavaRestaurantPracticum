package org.l2csl.beginnerjava.restaurant.appliance;

import org.l2csl.beginnerjava.restaurant.cookware.ICookware;

/**
 * Created by draco on 11/24/2016.
 */
public class Oven extends BaseAppliance {
    //

    @Override
    public void placeCookware(ICookware cookware) {
        // TODO: What cookware should an oven accept? Throw an exception if the wrong cookware is given
        // TODO: Is there a capacity on an oven? Enforce it with an exception
    }

    @Override
    public void cook() {
        // TODO: Once you cook the ingredients in an oven, what state do they become? For each ingredient, set it to the proper state
    }
}
