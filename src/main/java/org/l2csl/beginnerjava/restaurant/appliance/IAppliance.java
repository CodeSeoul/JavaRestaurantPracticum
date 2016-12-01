package org.l2csl.beginnerjava.restaurant.appliance;

import org.l2csl.beginnerjava.restaurant.cookware.ICookware;

import java.util.Map;

/**
 * Created by draco on 11/24/2016.
 */
public interface IAppliance {
    void placeCookware(ICookware cookware) throws Exception;
    ICookware takeCookware(String name);
    Map<String, ICookware> getContents();
    int getCapacity();
    void turnOn();
}
