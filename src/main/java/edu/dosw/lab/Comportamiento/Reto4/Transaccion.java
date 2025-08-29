package edu.dosw.lab.Comportamiento.Reto4;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Transaccion {
    private static int contador = 0;
    private int numero;
    private final BigDecimal monto;
    private final String origen;
    private final List<String> destinos;

    public Transaccion(BigDecimal monto, String origen, List<String> destinos) {
        this.numero = ++contador;
        this.monto = monto;
        this.origen = origen;
        this.destinos = destinos;
    }

    public Map<String, BigDecimal> procesar(Conversor conversor) {
        System.out.println("Transacción " +numero + ": "+ MonedaFormat.formatOriginal(monto) + " " + origen);
        Map<String, BigDecimal> r = new LinkedHashMap<>();
        for (String d : destinos) {
            BigDecimal convertido = conversor.convertir(monto, origen, d);
            r.put(d, convertido);
            System.out.println("Convertido a " + d + ": " + MonedaFormat.format(d, convertido) + " " + d);
        }
        return r;
    }
}
