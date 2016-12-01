package org.l2csl.beginnerjava.restaurant.appliance;

import org.l2csl.beginnerjava.restaurant.cookware.ICookware;

/**
 * Created by draco on 11/24/2016.
 */
public abstract class BaseAppliance implements IAppliance {

    @Override
    public void placeCookware(ICookware cookware) {
    }

    @Override
    public void cook() {
    }
}
