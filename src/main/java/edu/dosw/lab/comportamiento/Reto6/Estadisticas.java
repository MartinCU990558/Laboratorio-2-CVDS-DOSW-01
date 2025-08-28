package edu.dosw.lab.comportamiento.Reto6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Estadisticas {
    public static void generar(List<Ticket> tickets) {
        System.out.println("\n-- Estadísticas --");

        Map<String, Long> porTecnico = tickets.stream()
                .collect(Collectors.groupingBy(Ticket::getResueltoPor, Collectors.counting()));

        double resuelto = tickets.stream()
                .filter(t -> !t.getResueltoPor().equals("pendiente"))
                .count();

        System.out.println("Tickets resueltos: "+resuelto);

        porTecnico.forEach((tec, cant) -> System.out.println(tec + ": " + cant));

        long pendientes = tickets.stream().filter(t -> t.getResueltoPor().equals("pendiente")).count();
        System.out.println("Tickets pendientes: " + pendientes);


        double promedio = tickets.stream()
                .filter(t -> !t.getResueltoPor().equals("pendiente"))
                .mapToInt(t -> switch (t.getPrioridad()) {
                    case "baja" -> 1;
                    case "media" -> 2;
                    case "alta" -> 3;
                    default -> 0;
                })
                .average().orElse(0.0);

        System.out.println("Promedio de prioridad de tickets resueltos: " + promedio);
    }
}