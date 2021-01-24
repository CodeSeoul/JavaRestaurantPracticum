package org.l2csl.beginnerjava.restaurant.appliance;

import org.l2csl.beginnerjava.restaurant.cookware.ICookware;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by draco on 11/24/2016.
 */
public abstract class BaseAppliance implements IAppliance {
    protected Map<String, ICookware> contents;
    protected final int capacity = 0;

    public BaseAppliance() {
        contents = new HashMap<>();
    }

    @Override
    public void placeCookware(ICookware cookware) {
        // TODO: Check if the number of values in the contents map is greater than or equal to the capacity. If so, throw an error. We cannot add more cookware.
        // TODO: Place the cookware in this appliance's contents map using the cookware's name as the key
    }

    @Override
    public ICookware takeCookware(String name) {
        // TODO: Remove and return the requested cookware from this appliance
        return null;
    }

    @Override
    public void turnOn() {
        // TODO: On each cookware value in the contents map, call the cookware's heat method
    }

    // TODO: Write out the getters for contents and capacity
}
