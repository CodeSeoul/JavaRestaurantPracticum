package org.l2csl.beginnerjava.restaurant.appliance;

import org.l2csl.beginnerjava.restaurant.cookware.ICookware;

/**
 * Created by draco on 11/24/2016.
 */
public interface IAppliance {
    void placeCookware(ICookware cookware);
    ICookware takeCookware(String name);
    void turnOn();
}
