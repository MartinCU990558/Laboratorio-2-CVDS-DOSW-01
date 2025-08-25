package edu.dosw.lab.Comportamiento.Reto4;
import java.math.BigDecimal;
import java.util.Map;

public class ConversorTasas implements Conversor {
    private final Map<String, BigDecimal> tasas;

    public ConversorTasas(Map<String, BigDecimal> tasas) { this.tasas = tasas; }

    @Override
    public BigDecimal convertir(BigDecimal monto, String origen, String destino) {
        BigDecimal tasa = tasas.get(origen + "->" + destino);
        if (tasa == null) throw new IllegalArgumentException("Sin tasa para " + origen + "->" + destino);
        return monto.multiply(tasa);
    }
}
