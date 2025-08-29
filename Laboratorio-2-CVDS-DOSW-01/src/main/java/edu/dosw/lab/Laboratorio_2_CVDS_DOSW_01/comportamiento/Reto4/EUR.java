package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.Reto4;

public class EUR implements ConversionStrategy {
    private static final double tasaCambioCOP = 4702.60;
    private static final double tasaCambioJPY = 171.32;
    private static final double tasaCambioUSD = 1.17;

    @Override
    public double convertir(double monto, String monedaDestino) {
        switch (monedaDestino) {
            case "COP":
                return monto * tasaCambioCOP;
            case "JPY":
                return monto * tasaCambioJPY;
            case "USD":
                return monto * tasaCambioUSD;
            default:
                throw new IllegalArgumentException("Moneda no soportada: " + monedaDestino);
        }
    }

    
}
