package org.l2csl.java.restaurant;

import org.l2csl.java.restaurant.appliance.*;
import org.l2csl.java.restaurant.cookware.ICookware;
import org.l2csl.java.restaurant.cookware.Pan;
import org.l2csl.java.restaurant.cookware.Pot;
import org.l2csl.java.restaurant.cookware.Tray;

import java.util.HashMap;

/**
 * Created by draco on 11/24/2016.
 */
public class Kitchen {
    private final HashMap<String, IAppliance> appliances;
    private final HashMap<String, ICookware> cookware;
    private static Kitchen instance;
    private IngredientStore ingredientStore;

    private Kitchen() {
        appliances = new HashMap<>();
        appliances.put("stove", new Stove());
        appliances.put("oven", new Oven());

        cookware = new HashMap<>();
        cookware.put("pan", new Pan());
        cookware.put("pot", new Pot());
        cookware.put("tray", new Tray());

        ingredientStore = new IngredientStore();
    }

    // Singleton!
    public static Kitchen getInstance() {
        if(instance == null) {
            instance = new Kitchen();
        }
        return instance;
    }
}
