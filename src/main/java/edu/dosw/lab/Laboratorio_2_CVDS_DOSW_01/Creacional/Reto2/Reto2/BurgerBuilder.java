package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Creacional.Reto2;

import java.util.ArrayList;
import java.util.List;

public class BurgerBuilder {
    private final List<String> ingredients = new ArrayList<>();
    private double price = 0;

    public BurgerBuilder addIngredient(String ingredient, double cost) {
        ingredients.add(ingredient + " ($" + cost + ")");
        price += cost;
        return this;
    }

    public Burger build() {
        return new Burger(ingredients, price);
    }
}
