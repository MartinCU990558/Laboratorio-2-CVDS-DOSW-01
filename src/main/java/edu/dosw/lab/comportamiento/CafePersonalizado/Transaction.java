package edu.dosw.lab.comportamiento.CafePersonalizado;

import java.util.List;

public class Transaction {
    private double amount;
    private String fromCurrency;
    private List<String> toCurrencies;

    public Transaction(double amount, String fromCurrency, List<String> toCurrencies) {
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrencies = toCurrencies;
    }

    public double getAmount() {
        return amount;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public List<String> getToCurrencies() {
        return toCurrencies;
    }
}
