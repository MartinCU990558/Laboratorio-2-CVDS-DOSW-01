package edu.dosw.lab.comportamiento.ChainOfResponsibility.reto6;
import java.util.*;
import java.util.stream.Collectors;

public class Reto6 {

    private static int prioridadANumero(String prioridad) {
        switch (prioridad.toLowerCase()) {
            case "baja": return 1;
            case "media": return 2;
            case "alta": return 3;
            default: return 0;
        }
    }

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        Tecnico basico = new TecnicoBasico("Técnico Básico");
        Tecnico intermedio = new TecnicoIntermedio("Técnico Intermedio");
        Tecnico avanzado = new TecnicoAvanzado("Técnico Avanzado");

        basico.setSiguiente(intermedio);
        intermedio.setSiguiente(avanzado);

        System.out.print("Número de tickets: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        List<Ticket> tickets = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nTicket " + i + ":");
            System.out.print("Nivel (basico/intermedio/avanzado): ");
            String nivel = sc.nextLine();
            System.out.print("Prioridad (baja/media/alta): ");
            String prioridad = sc.nextLine();
            System.out.print("Descripción: ");
            String descripcion = sc.nextLine();

            tickets.add(new Ticket(i, nivel, prioridad, descripcion));
        }

        System.out.println("\nDatos de Entrada:");
        System.out.println("Número de tickets: " + tickets.size());
        for (Ticket t : tickets) {
            System.out.println("\nTicket " + t.getId() + ":");
            System.out.println("Nivel: " + t.getNivel());
            System.out.println("Prioridad: " + t.getPrioridad());
            System.out.println("Descripción: " + t.getDescripcion());
        }

        Map<Integer, String> resultados = new HashMap<>();
        System.out.println("\nDatos de Salida:");

        for (Ticket t : tickets) {
            String resultado = basico.resolver(t); // Inicia desde el primer eslabón
            resultados.put(t.getId(), resultado);
            System.out.println("Ticket " + t.getId() + ": " + resultado);
        }

        System.out.println("\n-- Estadísticas ---");

        Map<String, Long> ticketsPorTecnico = resultados.values().stream()
                .filter(r -> !r.contains("pendiente"))
                .collect(Collectors.groupingBy(
                        r -> {
                            if (r.contains("Técnico Básico resolvió")) return "Básico";
                            if (r.contains("Técnico Intermedio resolvió")) return "Intermedio";
                            if (r.contains("Técnico Avanzado resolvió")) return "Avanzado";
                            return "Otro";
                        },
                        Collectors.counting()
                ));

        System.out.println("Tickets resueltos:");
        System.out.println("Básico: " + ticketsPorTecnico.getOrDefault("Básico", 0L));
        System.out.println("Intermedio: " + ticketsPorTecnico.getOrDefault("Intermedio", 0L));
        System.out.println("Avanzado: " + ticketsPorTecnico.getOrDefault("Avanzado", 0L));

        long pendientes = resultados.values().stream()
                .filter(r -> r.contains("pendiente"))
                .count();
        System.out.println("Tickets pendientes: " + pendientes);

        double promedio = tickets.stream()
                .filter(t -> !resultados.get(t.getId()).contains("pendiente"))
                .mapToInt(t -> prioridadANumero(t.getPrioridad()))
                .average()
                .orElse(0.0);

        System.out.println("Promedio de prioridad de tickets resueltos: " + promedio);

        sc.close();
    }
    
}