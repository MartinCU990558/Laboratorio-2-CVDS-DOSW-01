package edu.dosw.lab.comportamiento.reto4;

import java.util.Map;

public class StandardConversion implements ConversionStrategy {
    private static final Map<String, Double> rates = Map.of(
            "USD", 1.0,
            "EUR", 0.86,
            "JPY", 147.01,
            "COP", 4000.0
    );

    @Override
    public double convert(double amount, String from, String to) {
        double usdValue = amount / rates.get(from);
        return usdValue * rates.get(to);
    }
}
