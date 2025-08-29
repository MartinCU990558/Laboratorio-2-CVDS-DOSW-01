package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Creacional.Reto2;

import java.util.List;

public class Burger {
    private final List<String> ingredients;
    private final double price;

    public Burger(List<String> ingredients, double price) {
        this.ingredients = ingredients;
        this.price = price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }
}
