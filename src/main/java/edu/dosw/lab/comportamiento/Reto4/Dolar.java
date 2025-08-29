package edu.dosw.lab.comportamiento.Reto4;

import java.util.List;

public class Dolar implements StrategyTasa {
    private String name;

    public Dolar() {
        name = "USD";
    }

    public String getName() {
        return name;
    }

    public double tasaReal(double monto, String destino) {
        switch (destino) {
            case "COP":
                return monto * 4025.59;
            case "USD":
                return monto;
            case "JPY":
                return monto * 146.97;
            case "EUR":
                return monto * 0.86;
            default:
                break;
        }
        return 0.0;
    }
}
