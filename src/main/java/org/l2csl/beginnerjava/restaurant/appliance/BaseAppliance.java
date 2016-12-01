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
        // TODO: Place the cookware in this appliance
    }

    @Override
    public ICookware takeCookware(String name) {
        // TODO: Remove and return the requested cookware from this appliance
        return null;
    }

    @Override
    public void turnOn() {
        // TODO: Heat up the cookware
        // Yes, you'll turn on the appliance multiple times. I get a little lazy
    }

    // TODO: Write out the getters for contents and capacity
}
