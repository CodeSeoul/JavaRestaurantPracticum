package org.l2csl.beginnerjava.restaurant;

import org.l2csl.beginnerjava.restaurant.appliance.IAppliance;
import org.l2csl.beginnerjava.restaurant.cookware.ICookware;

import java.util.Map;

/**
 * Created by draco on 11/24/2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Chef chef = new Chef();

        Recipe bibimbapRecipe = new Recipe(
                "bibimbap",
                new Ingredient[]{
                        new Ingredient(
                                "rice",
                                1,
                                Ingredient.BOILED
                        ),
                        new Ingredient(
                                "seaweed",
                                3,
                                Ingredient.RAW
                        )
                },
                new String[]{
                        "Boil rice",
                        "Roll rice in seaweed"
                }
            );

        Kitchen kitchen = chef.getKitchen();
        IngredientStore ingredientStore = kitchen.getIngredientStore();
        Map<String, IAppliance> appliances = kitchen.getAppliances();
        Map<String, ICookware> cookware = kitchen.getCookware();

        chef.take(ingredientStore.take("rice", 1));
        chef.take(ingredientStore.take("seaweed", 3));

        Ingredient rice = ingredientStore.take("rice", 1);
        Ingredient seaweed = ingredientStore.take("seaweed", 3);

        ICookware pot = cookware.get("pot");
        pot.placeIngredient(rice);
        appliances.get("stove").placeCookware(pot);
        appliances.get("stove").turnOn();
        appliances.get("stove").turnOn();
        pot.letCook();
        pot.takeIngredient("rice");

        Dish bibimbapDish = new Dish(bibimbapRecipe);
        bibimbapDish.addIngredient(rice);
        bibimbapDish.addIngredient(seaweed);
        bibimbapDish.prepare();


        Recipe lasagnaRecipe = new Recipe(
                "lasagna",
                new Ingredient[]{
                        new Ingredient(
                                "pasta",
                                1,
                                Ingredient.BOILED
                        ),
                        new Ingredient(
                                "beef",
                                3,
                                Ingredient.SAUTEED
                        ),
                        new Ingredient(
                                "cheese",
                                3,
                                Ingredient.SAUTEED
                        )
                },
                new String[]{
                        "Hell, I dunno how to make lasagna.",
                        "Ask Grandma",
                        "Eat Lasagna"
                }
        );
    }
}
