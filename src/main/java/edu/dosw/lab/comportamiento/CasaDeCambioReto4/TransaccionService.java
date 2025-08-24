package edu.dosw.lab.comportamiento.CasaDeCambioReto4;
import java.util.*;
import java.util.stream.Collectors;

public class TransaccionService {

    private final List<Transaccion> transacciones = new ArrayList<>();
    private final Map<String, Double> totales = new HashMap<>();

    private static final Map<String, Double> tasasUSD = Map.of(
            "USD", 1.0,
            "EUR", 0.91,
            "JPY", 150.0,
            "COP", 4000.0
    );

    public void agregarTransaccion(Transaccion t) {
        transacciones.add(t);
    }

    public void procesarTransacciones() {
        for (Transaccion t : transacciones) {
            System.out.println("\nTransacción " + t.getId() + ": " + t.getMonto() + " " + t.getOrigen());

            for (String destino : t.getDestinos()) {
                destino = destino.trim().toUpperCase();
                double convertido = convertir(t.getMonto(), t.getOrigen(), destino);
                System.out.println("Convertido a " + destino + ": " + String.format("%.3f", convertido) + " " + destino);

                totales.merge(destino, convertido, Double::sum);
            }
        }

        mostrarTotales();
    }

    private double convertir(double monto, String origen, String destino) {
        double usd = monto / tasasUSD.get(origen);  // convertir a USD
        return usd * tasasUSD.get(destino);         // convertir a destino
    }

    private void mostrarTotales() {
        System.out.println("\n---- Totales por moneda ----");
        totales.entrySet().stream()
                .map(e -> e.getKey() + ": " + String.format("%.3f", e.getValue()) + " " + e.getKey())
                .forEach(System.out::println);
    }
}
