package edu.dosw.lab.Comportamiento.reto6;

import java.util.*;
import java.util.stream.Collectors;

public class Reporte {
    private List<String> resultados = new ArrayList<>();
    private List<Ticket> resueltos = new ArrayList<>();
    private List<Ticket> pendientes = new ArrayList<>();

    public void agregarResultado(Ticket t, String msg) {
        resultados.add("Ticket " + t.getId() + ": " + msg);
        if(msg.contains("resolvió")) {
            resueltos.add(t);
        } else {
            pendientes.add(t);
        }
    }

    public void prependirNota(Ticket t, String nota) {
        for (int i = 0; i < resultados.size(); i++) {
            if(resultados.get(i).startsWith("Ticket " + t.getId())) {
                resultados.set(i, "Ticket " + t.getId() + ": " + nota + resultados.get(i).split(": ",2)[1]);
                break;
            }
        }
    }

    public void mostrarResultados() {
        resultados.forEach(System.out::println);
        System.out.println("\n--- Estadísticas ---");
        System.out.println("Tickets resueltos:");


        Map<String, Long> porNivel = resueltos.stream()
                .collect(Collectors.groupingBy(Ticket::getResueltoPor, Collectors.counting()));

        System.out.println("Básico: " + porNivel.getOrDefault("básico", 0L));
        System.out.println("Intermedio: " + porNivel.getOrDefault("intermedio", 0L));
        System.out.println("Avanzado: " + porNivel.getOrDefault("avanzado", 0L));
        System.out.println("Tickets pendientes: " + pendientes.size());


        double promedioPrioridad = resueltos.stream()
                .mapToInt(t -> {
                    switch (t.getPrioridad()) {
                        case "baja": return 1;
                        case "media": return 3;
                        case "alta": return 3;
                        default: return 0;
                    }
                }).average().orElse(0.0);

        System.out.println("Promedio de prioridad de tickets resueltos: " + promedioPrioridad);
    }
}
