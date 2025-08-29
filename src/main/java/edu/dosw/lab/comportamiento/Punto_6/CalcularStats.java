package edu.dosw.lab.comportamiento.Punto_6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalcularStats {
    public void generarEstadisticas(List<Ticket> tickets) {
        System.out.println("\n--- Estadísticas ---");
        Map<Dificultad, Long> resueltosPorNivel = tickets.stream()
            .filter(Ticket::isResuelto)
            .collect(Collectors.groupingBy(
                Ticket::getDificultad,
                Collectors.counting()
            ));
        System.out.println("Tickets resueltos:");
        for (Dificultad dificultad : Dificultad.values()) {
            long count = resueltosPorNivel.getOrDefault(dificultad, 0L);
            System.out.println(dificultad + ": " + count);
        }
        long pendientes = tickets.stream()
            .filter(t -> !t.isResuelto())
            .count();
        System.out.println("Tickets pendientes: " + pendientes);
        double promedioPrioridad = tickets.stream()
            .filter(Ticket::isResuelto)
            .mapToInt(t -> t.getPrioridad().getValor())
            .average()
            .orElse(0.0);
        
        System.out.println("Promedio de prioridad de tickets resueltos: " + promedioPrioridad);
    }
}