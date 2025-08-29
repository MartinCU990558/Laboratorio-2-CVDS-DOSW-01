package edu.dosw.lab.comportamiento.Reto4;

import java.util.List;

public class Euro implements StrategyTasa {
    private String name;

    public Euro() {
        name = "EUR";
    }

    public String getName() {
        return name;
    }

    public double tasaReal(double monto, String destino) {
        switch (destino) {
            case "COP":
                return monto * 4702.60;
            case "USD":
                return monto * 1.17;
            case "JPY":
                return monto * 171.62;
            case "EUR":
                return monto;
            default:
                break;
        }
        return 0.0;
    }
}
