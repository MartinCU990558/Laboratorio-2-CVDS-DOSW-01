package edu.dosw.lab.Comportamiento.Reto4;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {
    public static void ejecutar() {
        Map<String, BigDecimal> tasas = new HashMap<>();
        tasas.put("EUR->USD", new BigDecimal("1.10"));
        tasas.put("EUR->JPY", new BigDecimal("165"));
        tasas.put("COP->USD", new BigDecimal("0.00025"));
        tasas.put("COP->EUR", new BigDecimal("0.0002273"));

        Conversor conversor = new ConversorTasas(tasas);
        List<Transaccion> txs = Arrays.asList(
                new Transaccion(new BigDecimal("50"), "EUR", Arrays.asList("USD","JPY")),
                new Transaccion(new BigDecimal("100000"), "COP", Arrays.asList("USD","EUR"))
        );
        List<Map<String, BigDecimal>> resultados = new ArrayList<>();
        for (Transaccion t : txs) { resultados.add(t.procesar(conversor)); System.out.println(); }

        Map<String, BigDecimal> totales = resultados.stream()
                .flatMap(m -> m.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        BigDecimal::add,
                        LinkedHashMap::new
                ));

        System.out.println("---- Totales por moneda ----");
        for (String m : Arrays.asList("USD","JPY","EUR")) {
            if (totales.containsKey(m))
                System.out.println(m + ": " + MonedaFormat.format(m, totales.get(m)) + " " + m);
        }
    }
}
