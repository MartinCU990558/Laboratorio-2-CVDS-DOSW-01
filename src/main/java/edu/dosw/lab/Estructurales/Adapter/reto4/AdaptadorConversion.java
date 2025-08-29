package edu.dosw.lab.estructurales.Adapter.reto4;

import java.util.ArrayList;
import java.util.HashMap;

public class AdaptadorConversion {
    private ServicioConversion servicio;

    public AdaptadorConversion(ServicioConversion servicio) {
        this.servicio = servicio;
    }

    public HashMap<Moneda, Double> realizarConversión(ArrayList<Moneda> monedasDestino, Moneda monedaOrigen, double monto) {
        HashMap<Moneda, Double> conversiones = new HashMap<>();
        for (Moneda moneda : monedasDestino) {
            double valor = servicio.convertirDinero(monedaOrigen.name(), moneda.name(), monto);
            conversiones.put(moneda, valor);
        }
        return conversiones;
    }
}
