package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.Reto4;

public class COP implements ConversionStrategy {

    private static final double tasaCambioEUR = 0.00021;
    private static final double tasaCambioJPY = 0.036;
    private static final double tasaCambioUSD = 0.00025;

    @Override
    public double convertir(double monto, String monedaDestino) {
        switch (monedaDestino) {
            case "EUR":
                return monto * tasaCambioEUR;
            case "JPY":
                return monto * tasaCambioJPY;
            case "USD":
                return monto * tasaCambioUSD;
            default:
                throw new IllegalArgumentException("Moneda no soportada: " + monedaDestino);
        }
    }

    
}
