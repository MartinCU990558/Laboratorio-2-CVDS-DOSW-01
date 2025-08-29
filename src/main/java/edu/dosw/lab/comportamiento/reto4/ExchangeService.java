package edu.dosw.lab.comportamiento.reto4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExchangeService {
    private final ConversionStrategy strategy;

    public ExchangeService(ConversionStrategy strategy) {
        this.strategy = strategy;
    }

    public void processTransactions(List<Transaction> transactions) {
        transactions.forEach(tx -> {
            System.out.println("Transacción: " + tx.getAmount() + " " + tx.getSourceCurrency());
            tx.getTargetCurrencies().forEach(dest -> {
                double converted = strategy.convert(tx.getAmount(), tx.getSourceCurrency(), dest);
                System.out.printf("Convertido a %s: %.3f %s%n", dest, converted, dest);
            });
            System.out.println();
        });

        Map<String, Double> totals = transactions.stream()
                .flatMap(tx -> tx.getTargetCurrencies().stream()
                        .map(dest -> Map.entry(dest, strategy.convert(tx.getAmount(), tx.getSourceCurrency(), dest)))
                )
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        Double::sum
                ));

        System.out.println("---- Totales por moneda ----");
        totals.forEach((currency, total) -> System.out.printf("%s: %.3f%n", currency, total));
    }
}
