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
        // TODO: Remove the portion from this ingredient's amount. Return a new ingredient of the same name, where the amount is equal to the portion. Remove the return null.
        return null;
    }

    public void addPortion(int portion) {
        // TODO: Add the portion to this ingredient's amount
    }

    public void cook(String state) {
        // TODO: Change the ingredient's state to the given state
    }

    // TODO: Create getters for name, amount, and state

    @Override
    public String toString() {
        // TODO: An ingredient should be represented like "2 of sauteed garlic"
        return "";
    }

    public boolean equals(Object obj) {
        // TODO: Return true if the name, amount, and state between this ingredient and the given object match.
        // Hint: You'll need to cast obj to an Ingredient
        return false;
    }

    public int hashCode() { // Don't worry about this
        int hashPrime = 31;
        int hash = 7;
        String stringRep = toString();
        for(int i = 0; i < stringRep.length(); i++) {
            hash = hash*31 + stringRep.charAt(i);
        }
        return hash;
    }
}
