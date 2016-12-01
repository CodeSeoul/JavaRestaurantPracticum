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

    public Map<String, ICookware> getContents() {
        return contents;
    }

    public int getCapacity() {
        return capacity;
    }
}
