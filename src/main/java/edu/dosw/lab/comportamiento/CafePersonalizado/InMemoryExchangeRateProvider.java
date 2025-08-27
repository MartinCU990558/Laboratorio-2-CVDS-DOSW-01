package edu.dosw.lab.comportamiento.CafePersonalizado;

import java.util.HashMap;
import java.util.Map;

/**public class InMemoryExchangeRateProvider implements ExchangeRateProvider {
    private final Map<String, Double> exchangeRates = new HashMap<>();

    public InMemoryExchangeRateProvider() {
        exchangeRates.put("USD->EUR", 0.92);
        exchangeRates.put("USD->JPY", 145.3);
        exchangeRates.put("USD->COP", 4100.0);

        exchangeRates.put("EUR->USD", 1.09);
        exchangeRates.put("EUR->JPY", 158.2);
        exchangeRates.put("EUR->COP", 4450.0);

        exchangeRates.put("JPY->USD", 0.0069);
        exchangeRates.put("JPY->EUR", 0.0063);
        exchangeRates.put("JPY->COP", 28.2);

        exchangeRates.put("COP->USD", 0.00024);
        exchangeRates.put("COP->EUR", 0.00022);
        exchangeRates.put("COP->JPY", 0.035);
    }

    @Override
    public double getExchangeRate(String fromCurrency, String toCurrency) {
        return exchangeRates.getOrDefault(fromCurrency + "->" + toCurrency, 1.0);
    }
}
**/