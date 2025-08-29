package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.Reto4;

public class USD implements ConversionStrategy {

    private static final double tasaCambioCOP = 0.00025;
    private static final double tasaCambioEUR = 0.86;
    private static final double tasaCambioJPY = 146.91;

    @Override
    public double convertir(double monto, String monedaDestino) {
        switch (monedaDestino) {
            case "COP":
                return monto / tasaCambioCOP;
            case "EUR":
                return monto * tasaCambioEUR;
            case "JPY":
                return monto * tasaCambioJPY;
            default:
                throw new IllegalArgumentException("Moneda no soportada: " + monedaDestino);
        }
    }


    
}
