package edu.dosw.lab.estructurales.Decorator.reto5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ToppingsCafe {
    private static final HashMap<String, Integer> toppings = new LinkedHashMap<>();

    static {
        toppings.put("Leche",1000);
        toppings.put("Chocolate",1500);
        toppings.put("Caramelo",1200);
        toppings.put("Crema batida",2000);
        toppings.put("Menta",1300);
    }

    public static HashMap<String, Integer> obtenerToppings() {
        return toppings;
    }
}