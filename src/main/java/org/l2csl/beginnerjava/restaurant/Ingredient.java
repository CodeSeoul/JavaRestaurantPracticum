package org.l2csl.beginnerjava.restaurant;

/**
 * Created by draco on 11/24/2016.
 */
public class Ingredient {

    public static final String RAW = "raw";
    public static final String BOILED = "boiled";
    public static final String SAUTEED = "sauteed";
    public static final String BAKED = "baked";

    private final String name;
    private int amount;
    private String state;

    public Ingredient(String name, int amount) {
        this(name, amount, RAW);
    }

    private Ingredient(String name, int amount, String state) {
        this.name = name;
        this.amount = amount;
        this.state = state;
    }

    public Ingredient takePortion(int portion) {
        this.amount -= portion;
        return new Ingredient(name, portion);
    }

    public void addPortion(int portion) {
        this.amount += portion;
    }

    public void cook(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return Integer.toString(amount) + " of " + state + " " + name;
    }
}