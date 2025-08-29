package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto4;

public class CurrencyConverter {
    private ConversionStrategy strategy;

    public void setStrategy(ConversionStrategy strategy) {
        this.strategy = strategy;
    }

    public double execute(double amount) {
        if (strategy == null) throw new IllegalStateException("No se ha definido una estrategia de conversión");
        return strategy.convert(amount);
    }

    public String getTargetCurrency() {
        return strategy.getTargetCurrency();
    }
}
