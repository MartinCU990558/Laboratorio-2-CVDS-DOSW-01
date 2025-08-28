package edu.dosw.lab.comportamiento.HablaConSoporteTecnico;

import java.util.*;
import java.util.stream.Collectors;

public class SoporteTecnico {

    public static void ejecutar() {

        Scanner scanner = new Scanner(System.in);
        TecnicoBasico basico = new TecnicoBasico();
        TecnicoIntermedio intermedio = new TecnicoIntermedio();
        TecnicoAvanzado avanzado = new TecnicoAvanzado();

        basico.setSiguienteTecnico(intermedio);
        intermedio.setSiguienteTecnico(avanzado);

        System.out.print("Ingrese el número de tickets: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Ticket> tickets = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTicket " + i + ":");
            System.out.print("Nivel (basico/intermedio/avanzado): ");
            String nivel = scanner.nextLine();

            System.out.print("Prioridad (baja/media/alta): ");
            String prioridad = scanner.nextLine();

            System.out.print("Descripción: ");
            String descripcion = scanner.nextLine();

            tickets.add(new Ticket(nivel, prioridad, descripcion, null));
        }

        List<Ticket> resueltos = new ArrayList<>();
        List<Ticket> pendientes = new ArrayList<>();

        for (Ticket t : tickets) {
            boolean resuelto = basico.manejarTicket(t);
            if (resuelto) {
                resueltos.add(t);
            } else {
                pendientes.add(t);
            }
        }

        System.out.println("\n--- Estadísticas ---");
        System.out.println("• Tickets resueltos:" + resueltos.size());

        Map<String, Long> ticketsPorNivel = resueltos.stream().collect(Collectors.groupingBy(t -> t.getTecnicoAsignado().toLowerCase(), Collectors.counting()));

        System.out.println("• Básico: " + ticketsPorNivel.getOrDefault("basico", 0L));
        System.out.println("• Intermedio: " + ticketsPorNivel.getOrDefault("intermedio", 0L));
        System.out.println("• Avanzado: " + ticketsPorNivel.getOrDefault("avanzado", 0L));

        System.out.println("• Tickets pendientes: " + pendientes.size());

        Map<String, Integer> prioridadMap = Map.of(
                "baja", 1,
                "media", 2,
                "alta", 3
        );

        double promedio = resueltos.stream()
                .mapToInt(t -> prioridadMap.getOrDefault(t.getNivelPrioridad().toLowerCase(), 0))
                .average()
                .orElse(0.0);

        System.out.println("• Promedio de prioridad de tickets resueltos: " + promedio);
    }
}
