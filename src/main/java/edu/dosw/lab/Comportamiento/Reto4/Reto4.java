package edu.dosw.lab.Comportamiento.Reto4;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Map<String, BigDecimal> tasas = new HashMap<>();
        tasas.put("EUR->USD", new BigDecimal("1.10"));
        tasas.put("EUR->JPY", new BigDecimal("165"));
        tasas.put("COP->USD", new BigDecimal("0.00025"));
        tasas.put("COP->EUR", new BigDecimal("0.0002273"));

        Conversor conversor = new ConversorTasas(tasas);

        List<Transaccion> txs = new ArrayList<>();

        System.out.print("Ingrese número de transacciones: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n---- Transacción " + i + " ----");
            System.out.print("Ingrese monto: ");
            BigDecimal monto = sc.nextBigDecimal();
            sc.nextLine();

            System.out.print("Ingrese moneda de origen (USD, EUR, JPY, COP): ");
            String origen = sc.nextLine().trim();

            System.out.print("Ingrese monedas destino (separadas por coma, ej: USD,JPY): ");
            String[] destinosArr = sc.nextLine().split(",");
            List<String> destinos = new ArrayList<>();
            for (String d : destinosArr) {
                destinos.add(d.trim());
            }

            txs.add(new Transaccion(monto, origen, destinos));
        }

        List<Map<String, BigDecimal>> resultados = new ArrayList<>();
        for (Transaccion t : txs) {
            resultados.add(t.procesar(conversor));
            System.out.println();
        }

        Map<String, BigDecimal> totales = resultados.stream()
                .flatMap(m -> m.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        BigDecimal::add,
                        LinkedHashMap::new
                ));
        System.out.println("---- Totales por moneda ----");
        for (String m : Arrays.asList("USD", "JPY", "EUR")) {
            if (totales.containsKey(m))
                System.out.println(m + ": " + MonedaFormat.format(m, totales.get(m)) + " " + m);
        }
    }
}
