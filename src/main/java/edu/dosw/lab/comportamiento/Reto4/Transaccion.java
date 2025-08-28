package edu.dosw.lab.comportamiento.Reto4;

public class Transaccion {
    private String origen;
    private String destino;
    private double monto;
    private double convertido;

    public Transaccion(String origen, String destino, double monto, ConversorMonedas conversor) {
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;
        this.convertido = conversor.convertir(origen, destino, monto);
    }

    public String getDestino() {
        return destino;
    }

    public double getConvertido() {
        return convertido;
    }


}