package org.l2csl.beginnerjava.restaurant.appliance;

import org.l2csl.beginnerjava.restaurant.cookware.ICookware;

/**
 * Created by draco on 11/24/2016.
 */
public class Stove extends BaseAppliance {

    protected final int capacity = 4;

    @Override
    public void placeCookware(ICookware cookware) throws Exception {
        // They can't both be a pot and a pan, so if they're the same, they're both false
        if(cookware.getName().equals("pan") == cookware.getName().equals("pot")) {
            throw new Exception("Incorrect cookware put in stove.");
        }
        if(contents.size() == capacity) {
            throw new Exception("Stove at capacity. Cannot add more cookware.");
        }
        super.placeCookware(cookware);
    }
}
