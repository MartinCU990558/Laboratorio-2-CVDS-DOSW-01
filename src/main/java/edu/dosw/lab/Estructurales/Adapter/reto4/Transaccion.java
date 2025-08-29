package edu.dosw.lab.estructurales.Adapter.reto4;

import java.util.ArrayList;
import java.util.HashMap;

public class Transaccion {
    private double valorOriginal;
    private HashMap<Moneda, Double> valoresFinales = new HashMap<>();
    private Moneda monedaOrigen;
    private ArrayList<Moneda> monedasDestino;
    private AdaptadorConversion servicioConversion;
    private int numeroTransaccion;

    public Transaccion(Moneda monedaOrigen, double valorOriginal, ArrayList<Moneda> monedasDestino, int numeroTransaccion) {
        this.monedaOrigen = monedaOrigen;
        this.valorOriginal = valorOriginal;
        this.monedasDestino = monedasDestino;
        this.numeroTransaccion = numeroTransaccion;
        this.servicioConversion = new AdaptadorConversion(new ServicioConversion());
    }

    public double getValorOriginal() {
        return valorOriginal;
    }
    public HashMap<Moneda, Double> getValoresFinales(){
        return calcularValoresFinales();
    }

    public Moneda getMonedaOrigen() {
        return monedaOrigen;
    }
    public ArrayList<Moneda> getMonedaDestino() {
        return monedasDestino;
    }

    private HashMap<Moneda, Double> calcularValoresFinales(){
        valoresFinales = servicioConversion.realizarConversión(monedasDestino,monedaOrigen,valorOriginal);
        return valoresFinales;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTransacción ").append(numeroTransaccion).append(" : ").append(valorOriginal).append(" ").append(monedaOrigen).append("\n");
        getValoresFinales();
        for (Moneda mon : valoresFinales.keySet()) {
            sb.append("Convertido a ").append(mon).append(": ").append(valoresFinales.get(mon)).append("\n");
        }
        return sb.toString();
    }
}