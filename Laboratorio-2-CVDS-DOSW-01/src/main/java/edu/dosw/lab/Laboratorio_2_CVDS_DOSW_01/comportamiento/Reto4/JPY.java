package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.Reto4;

public class JPY implements ConversionStrategy { 

    private static final double tasaCambioCOP = 27.41;
    private static final double tasaCambioEUR = 0.0058;
    private static final double tasaCambioUSD = 0.0068;

    @Override
    public double convertir(double monto, String monedaDestino) {
        switch (monedaDestino) {
            case "COP":
                return monto * tasaCambioCOP;
            case "EUR":
                return monto * tasaCambioEUR;
            case "USD":
                return monto * tasaCambioUSD;
            default:
                throw new IllegalArgumentException("Moneda no soportada: " + monedaDestino);
        }
    }

    
}
