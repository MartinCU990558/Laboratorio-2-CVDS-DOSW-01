package edu.dosw.lab.comportamiento.Reto4;

import java.util.List;

public class Yen implements StrategyTasa {
    private String name;

    public Yen() {
        name = "JPY";
    }

    public String getName() {
        return name;
    }

    public double tasaReal(double monto, String destino) {
        switch (destino) {
            case "COP":
                return monto * 27.40;
            case "USD":
                return monto * 0.0068;
            case "JPY":
                return monto;
            case "EUR":
                return monto * 0.0058;
            default:
                break;
        }
        return 0.0;
    }
}
