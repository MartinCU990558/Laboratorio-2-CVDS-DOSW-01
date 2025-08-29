package edu.dosw.lab.comportamiento.reto4;

import java.util.List;

public class Transaction {
    private final double amount;
    private final String sourceCurrency;
    private final List<String> targetCurrencies;

    public Transaction(double amount, String sourceCurrency, List<String> targetCurrencies) {
        this.amount = amount;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrencies = targetCurrencies;
    }

    public double getAmount() { return amount; }
    public String getSourceCurrency() { return sourceCurrency; }
    public List<String> getTargetCurrencies() { return targetCurrencies; }
}
