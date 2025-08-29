package edu.dosw.lab.estructurales.Adapter.reto4;

public enum Moneda {
    USD(1.0),
    EUR(0.91),
    JPY(160.0),
    COP(4000.0);

    private final double tasaUSD;

    Moneda(double tasaDesdeUSD) {
        this.tasaUSD = tasaDesdeUSD;
    }

    public double getTasaDesdeUSD() {
        return tasaUSD;
    }
}

