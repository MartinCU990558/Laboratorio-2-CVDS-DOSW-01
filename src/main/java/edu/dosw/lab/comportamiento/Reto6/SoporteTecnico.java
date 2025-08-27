package edu.dosw.lab.comportamiento.Reto6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoporteTecnico{
        public static void ejecutar6() {
        Scanner sc = new Scanner(System.in);

        Technical basic = new BasicTechnical(Priority.BAJA);
        Technical intermediate = new IntermediateTechnical(Priority.MEDIA);
        Technical advanced = new AdvanceTechnical(Priority.ALTA);

        basic.setNext(intermediate);
        intermediate.setNext(advanced);

        System.out.print("Número de tickets: ");
        int n = Integer.parseInt(sc.nextLine());

        List<Ticket> tickets = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
                System.out.println("\nTicket " + i + ":");

                System.out.print("Nivel: ");
                Difficult level = Difficult.valueOf(sc.nextLine().toUpperCase());

                System.out.print("Prioridad: ");
                Priority priority = Priority.valueOf(sc.nextLine().toUpperCase());

                System.out.print("Descripción: ");
                String description = sc.nextLine();

                tickets.add(new Ticket(description, level, priority));
        }

        tickets.forEach(basic::attends);

        for (int i = 0; i < tickets.size(); i++) {
                Ticket t = tickets.get(i);
                System.out.println("Ticket " + (i + 1) + ": " + t.getResult());
        }

        System.out.println("-- Estadísticas ---");

        Map<String, Long> ticketsForTechnical = tickets.stream()
                .filter(t -> t.getTechnicianName() != null)
                .collect(Collectors.groupingBy(
                        Ticket::getTechnicianName,
                        Collectors.counting()
                        ));

        ticketsForTechnical.putIfAbsent("Técnico Básico", 0L);
        ticketsForTechnical.putIfAbsent("Técnico Intermedio", 0L);
        ticketsForTechnical.putIfAbsent("Técnico Avanzado", 0L);

        System.out.println("Tickets resueltos:");
        System.out.println(" Básico: " + ticketsForTechnical.get("Técnico Básico"));
        System.out.println(" Intermedio: " + ticketsForTechnical.get("Técnico Intermedio"));
        System.out.println(" Avanzado: " + ticketsForTechnical.get("Técnico Avanzado"));

        long onHold = tickets.stream()
                .filter(t -> t.getTechnicianName() == null)
                .count();
        System.out.println(" Tickets pendientes: " + onHold);

        double priorityAverage = tickets.stream()
                .filter(t -> t.getTechnicianName() != null)
                .mapToInt(t -> t.getPriority().getLevel())
                .average()
                .orElse(0);
        System.out.println(" Promedio de prioridad de tickets resueltos: " + priorityAverage);
        sc.close();
        
        }
}