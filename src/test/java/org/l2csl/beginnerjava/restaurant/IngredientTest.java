package org.l2csl.beginnerjava.restaurant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by draco on 12/1/2016.
 */
class IngredientTest {
    List<Ingredient> ingredients;

    @BeforeEach
    void setUp() {
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("onion", 10));
        ingredients.add(new Ingredient("pasta", 2));

        ingredients.get(1).cook(Ingredient.BOILED);
    }

    @Test
    void takePortion() {

    }

    @Test
    void addPortion() {

    }

    @Test
    void cook() {

    }

    @Test
    void toStringTest() {
        String rawOnionString = ingredients.get(0).toString();
        assertEquals("10 of raw onion", rawOnionString);
        String boiledPastaString = ingredients.get(1).toString();
        assertEquals("2 of boiled pasta", boiledPastaString);
    }

}