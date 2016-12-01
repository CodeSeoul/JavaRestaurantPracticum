package org.l2csl.beginnerjava.restaurant.appliance;

import org.l2csl.beginnerjava.restaurant.cookware.ICookware;

/**
 * Created by draco on 11/24/2016.
 */
public class Oven extends BaseAppliance {

    protected final int capacity = 2;

    @Override
    public void placeCookware(ICookware cookware) throws Exception {
        if(!cookware.getName().equals("tray")) {
            throw new Exception("Incorrect cookware put in oven.");
        }
        if(contents.size() == capacity) {
            throw new Exception("Oven at capacity. Cannot add more cookware.");
        }
        super.placeCookware(cookware);
    }
}
