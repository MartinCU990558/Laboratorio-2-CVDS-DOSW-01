package edu.dosw.lab.comportamiento.Reto4;

import java.util.List;

public class PesoColombiano implements StrategyTasa {
    private String name;

    public PesoColombiano() {
        name = "COP";
    }

    public String getName() {
        return name;
    }

    public double tasaReal(double monto, String destino) {
        switch (destino) {
            case "COP":
                return monto;
            case "USD":
                return monto * 0.00025;
            case "JPY":
                return monto * 0.037;
            case "EUR":
                return monto * 0.00021;
            default:
                break;
        }
        return 0.0;
    }
}
