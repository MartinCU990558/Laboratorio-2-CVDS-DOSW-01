package edu.dosw.lab.creacionales.Builder.reto2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class menuIngredientes {
    private static final Map<String, Double> INGREDIENTES;

    static {
        Map<String, Double> ingredientesTemp = new HashMap<>();
        ingredientesTemp.put("Pan",3.0);
        ingredientesTemp.put("Carne",1.0000);
        ingredientesTemp.put("Queso",5.000);
        ingredientesTemp.put("Lechuga",2.000);
        ingredientesTemp.put("Tomate",2.000);
        ingredientesTemp.put("Salsa Especial",3.000);

        INGREDIENTES = Collections.unmodifiableMap(ingredientesTemp);
    }

    public static Map<String, Double> obtenerIngredientes() {
        return INGREDIENTES;
    }
}
