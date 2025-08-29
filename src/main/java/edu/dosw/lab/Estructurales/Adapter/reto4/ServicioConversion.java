package edu.dosw.lab.Estructurales.Adapter.reto4;

public class ServicioConversion {
    public double convertirDinero(String monedaOrigen, String monedaDestino, double cantidad) {
        Moneda origen = Moneda.valueOf(monedaOrigen);
        Moneda destino = Moneda.valueOf(monedaDestino);

        if (origen == destino) {
            return cantidad;
        }

        // Paso 1: origen → USD
        double enUSD = cantidad / origen.getTasaDesdeUSD();

        // Paso 2: USD → destino
        return enUSD * destino.getTasaDesdeUSD();
    }
}
