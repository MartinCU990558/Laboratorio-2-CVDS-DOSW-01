package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto4;

public class EurConversion implements ConversionStrategy {
    private static final double RATE = 0.92;
    @Override public double convert(double amount) {
        return amount * RATE;
    }
    @Override public String getTargetCurrency() {
        return "EUR";
    }
}
