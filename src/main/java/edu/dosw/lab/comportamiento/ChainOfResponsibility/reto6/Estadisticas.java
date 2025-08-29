package edu.dosw.lab.comportamiento.ChainOfResponsibility.reto6;

import java.util.*;
import java.util.stream.*;

public class Estadisticas {

    private static int prioridadANumero(String prioridad) {
        switch (prioridad.toLowerCase()) {
            case "baja": return 1;
            case "media": return 2;
            case "alta": return 3;
            default: return 0;
        }
    }

    public static void generarEstadisticas(List<Ticket> tickets, Map<String, String> resultados) {
        System.out.println("\n-- Estadísticas ---");

        Map<String, Long> ticketsPorTecnico = resultados.values().stream()
                .filter(r -> !r.contains("pendiente"))
                .collect(Collectors.groupingBy(r -> r.split(" ")[0], Collectors.counting()));

        ticketsPorTecnico.forEach((tecnico, count) ->
                System.out.println(tecnico + ": " + count));

        long pendientes = resultados.values().stream()
                .filter(r -> r.contains("pendiente"))
                .count();
        System.out.println("Tickets pendientes: " + pendientes);

        double promedio = tickets.stream()
                .filter(t -> !resultados.get("Ticket " + t.getId()).contains("pendiente"))
                .mapToInt(t -> prioridadANumero(t.getPrioridad()))
                .average()
                .orElse(0.0);

        System.out.println("Promedio de prioridad de tickets resueltos: " + promedio);
    }
}