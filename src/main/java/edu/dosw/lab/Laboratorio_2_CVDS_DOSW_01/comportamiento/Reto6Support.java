package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Locale;

public class Reto6Support {

    public static void ejecutar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Número de tickets: ");
        int n;
        while (!scanner.hasNextInt()) {
            System.out.println("Debes ingresar al menos 1 ticket");
            scanner.nextLine();
        }

        n = scanner.nextInt();
        scanner.nextLine();
        List<Ticket> tickets = new ArrayList<>();

        Map<String, Ticket.Level> levelMap = new HashMap<>();
        for (Ticket.Level l : Ticket.Level.values()) levelMap.put(l.name().toLowerCase(), l);

        Map<String, Ticket.Priority> priorityMap = new HashMap<>();
        for (Ticket.Priority p : Ticket.Priority.values()) priorityMap.put(p.name().toLowerCase(), p);

        for (int i = 1; i <= n; i++) {
            System.out.println("Ticket: " + i);

            Ticket.Level level = null;
            while (level == null) {
                System.out.println("Ingrese el nivel del ticket (basico, intermedio, avanzado):");
                String line = scanner.nextLine().trim().toLowerCase();
                if (levelMap.containsKey(line)) {
                    level = levelMap.get(line);
                } else {
                    System.out.println("Nivel inválido. Intente nuevamente.");
                }
            }

            Ticket.Priority priority = null;
            while (priority == null) {
                System.out.println("Ingrese la prioridad del ticket (baja, media, alta):");
                String line = scanner.nextLine().trim().toLowerCase();
                if (priorityMap.containsKey(line)) {
                    priority = priorityMap.get(line);
                } else {
                    System.out.println("Prioridad inválida. Intente nuevamente.");
                }
            }

            System.out.println("Ingrese la descripción del ticket:");
            String description = scanner.nextLine().trim();
            if (description.isEmpty()) description = "(sin descripción)";

            tickets.add(new Ticket(i, level, priority, description));
        }

        if (tickets.isEmpty()) {
            System.out.println("No se ingresaron tickets. Terminando ejecución.");
            scanner.close();
            return;
        }

        Technician basic = new Technician("Técnico Básico",
                EnumSet.of(Ticket.Level.BASICO),
                Ticket.Priority.BAJA);

        Technician intermediate = new Technician("Técnico Intermedio",
                EnumSet.of(Ticket.Level.INTERMEDIO),
                Ticket.Priority.MEDIA);

        Technician advanced = new Technician("Técnico Avanzado",
                EnumSet.of(Ticket.Level.AVANZADO, Ticket.Level.INTERMEDIO),
                Ticket.Priority.ALTA);

        basic.setNext(intermediate);
        intermediate.setNext(advanced);
        tickets.forEach(basic::handle);

        System.out.println();
        tickets.forEach(t -> {
            String result;
            if (t.isEscalated()) {
                result = "Ningún técnico disponible. Ticket pendiente de escalamiento.";
            } else {
                String combined = String.join(" ", t.getLogs()).trim();
                if (combined.isEmpty()) {
                    result = t.getResolvedBy() + " resolvió el problema.";
                } else {
                    result = combined;
                }
            }
            System.out.println("Ticket " + t.getId() + ": " + result);
        });

        System.out.println();
        Map<Ticket.Level, Long> resolvedByCategory = tickets.stream()
                .filter(t -> !t.isEscalated() && t.getResolvedByLevel() != null)
                .collect(Collectors.groupingBy(
                        Ticket::getResolvedByLevel,
                        Collectors.counting()
                ));

        long pendingTickets = tickets.stream().filter(Ticket::isEscalated).count();

        double averagePriorityResolved = tickets.stream()
                .filter(t -> !t.isEscalated())
                .mapToInt(t -> t.getPriority().getValue())
                .average()
                .orElse(0.0);

        System.out.println("-- Estadísticas --");
        System.out.println("Tickets resueltos:");
        System.out.println("Básico: " + resolvedByCategory.getOrDefault(Ticket.Level.BASICO, 0L));
        System.out.println("Intermedio: " + resolvedByCategory.getOrDefault(Ticket.Level.INTERMEDIO, 0L));
        System.out.println("Avanzado: " + resolvedByCategory.getOrDefault(Ticket.Level.AVANZADO, 0L));
        System.out.println("Tickets pendientes: " + pendingTickets);
        System.out.printf(Locale.US, "Promedio de prioridad de tickets resueltos: %.1f%n", averagePriorityResolved);

        scanner.close();
    }
}

