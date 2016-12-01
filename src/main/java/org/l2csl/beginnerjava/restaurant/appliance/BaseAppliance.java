package org.l2csl.beginnerjava.restaurant.appliance;

import org.l2csl.beginnerjava.restaurant.cookware.ICookware;

import java.util.Map;

/**
 * Created by draco on 11/24/2016.
 */
public abstract class BaseAppliance implements IAppliance {
    Map<String, ICookware> contents;

    @Override
    public void placeCookware(ICookware cookware) throws Exception {
        contents.put(cookware.getName(), cookware);
    }

    @Override
    public ICookware takeCookware(String name) {
        return contents.remove(name);
    }

    @Override
    public void turnOn() {
        for (ICookware cookware : contents.values()) {
            cookware.heat();
        }
    }
}
