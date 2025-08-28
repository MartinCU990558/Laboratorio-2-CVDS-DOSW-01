package edu.dosw.lab.comportamiento.Reto4;

import java.util.*;
public class ConversorMonedas implements conversor {
    private Map<String, Double> tasas;

    public ConversorMonedas() {
        tasas = new HashMap<>();
        tasas.put("USD", 1.0);
        tasas.put("EUR", 0.92);
        tasas.put("JPY", 146.3);
        tasas.put("COP", 4060.0);
    }

    public double convertir(String de, String a, double monto) {
        double enUsd = monto / tasas.get(de);
        return enUsd * tasas.get(a);
    }
}
