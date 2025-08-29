package edu.dosw.lab.comportamiento.reto6;

import java.util.*;

public class Reto6 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        List<Ticket> tickets = new ArrayList<>();

        System.out.println("¿Cuántos tickets deseas ingresar?");
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            System.out.println("=== Ticket " + (i + 1) + " ===");
            System.out.println("Nivel (BASICO, INTERMEDIO, AVANZADO):");
            Nivel nivel = Nivel.valueOf(sc.nextLine().trim().toUpperCase());
            System.out.println("Prioridad (BAJA, MEDIA, ALTA):");
            Prioridad prioridad = Prioridad.valueOf(sc.nextLine().trim().toUpperCase());
            System.out.println("Descripción:");
            String descripcion = sc.nextLine().trim();
            tickets.add(new Ticket(nivel, prioridad, descripcion));
        }

        Tecnico basico = new TecnicoBasico();
        Tecnico intermedio = new TecnicoIntermedio();
        Tecnico avanzado = new TecnicoAvanzado();

        basico.setSiguiente(intermedio);
        intermedio.setSiguiente(avanzado);

        Map<String, Long> resueltosPorTecnico = new HashMap<>();
        int pendientes = 0;

        int sumaPrioridadesTodos = tickets.stream()
                .mapToInt(t -> t.getPrioridad().getValor())
                .sum();
        int cantidadResueltos = 0;

        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            String resultado = basico.resolver(ticket);
            System.out.println("Ticket " + (i + 1) + ": " + resultado);

            if (resultado.startsWith("Técnico")) {
                cantidadResueltos++;
                if (resultado.contains("Técnico Básico resolvió")) {
                    resueltosPorTecnico.put("Básico", resueltosPorTecnico.getOrDefault("Básico", 0L) + 1);
                } else if (resultado.contains("Técnico Intermedio resolvió")) {
                    resueltosPorTecnico.put("Intermedio", resueltosPorTecnico.getOrDefault("Intermedio", 0L) + 1);
                } else if (resultado.contains("Técnico Avanzado resolvió")) {
                    resueltosPorTecnico.put("Avanzado", resueltosPorTecnico.getOrDefault("Avanzado", 0L) + 1);
                }
            } else {
                pendientes++;
            }
        }

        System.out.println("\n--- Estadísticas ---");
        System.out.println("Tickets resueltos:");
        System.out.println("Básico: " + resueltosPorTecnico.getOrDefault("Básico", 0L));
        System.out.println("Intermedio: " + resueltosPorTecnico.getOrDefault("Intermedio", 0L));
        System.out.println("Avanzado: " + resueltosPorTecnico.getOrDefault("Avanzado", 0L));
        System.out.println("Tickets pendientes: " + pendientes);

        double promedio = cantidadResueltos == 0 ? 0.0 : (double) sumaPrioridadesTodos / cantidadResueltos;
        System.out.println("Promedio de prioridad de tickets resueltos: " + promedio);
    }
}