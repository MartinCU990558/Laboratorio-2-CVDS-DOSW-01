package edu.dosw.lab.Comportamiento.Reto6;
import java.util.*;
import java.util.Scanner;
import java.util.stream.*;

public class Reto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Ticket> tickets = new ArrayList<>();
        System.out.println("Ingrese el ticket que desea: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Ticket " + (i+1) + ":");
            System.out.println("Nivel:");
            String nivel = sc.nextLine();
            System.out.println("Prioridad: ");
            String prioridad = sc.nextLine();
            System.out.println("Descripcion :");
            String descripcion = sc.nextLine();
            tickets.add(new Ticket(i+1, nivel, prioridad, descripcion, false));
            System.out.println();
        }

        SoporteHandler basico = new TecnicoBasico();
        SoporteHandler intermedio = new TecnicoIntermedio();
        SoporteHandler avanzado = new TecnicoAvanzado();

        basico.setSiguiente(intermedio);
        intermedio.setSiguiente(avanzado);

        tickets.forEach(basico::manejarTicket);
        for (Ticket ticket : tickets) {
            if(ticket.isResuelto()){
                System.out.println("Ticket " + ticket.getNumeroTicket() + ": " + ticket.getTecnico() + "resolvió el problema.");
            } else{
                System.out.println("Ticket " + ticket.getNumeroTicket() + ": Ningún técnico disponible. Ticket pendiente de escalamiento.");
            }
        }
        System.out.println("--Estadisticas--");
        Map<String, Long> resueltosPorTecnico = tickets.stream().filter(Ticket::isResuelto)
                .collect(Collectors.groupingBy(Ticket::getTecnico, Collectors.counting()));
        System.out.println("Tickets resueltos:");
        System.out.println("Basico: " + resueltosPorTecnico.getOrDefault("Tecnico Basico", 0L));
        System.out.println("Intermedio: " + resueltosPorTecnico.getOrDefault("Tecnico Intermedio", 0L));
        System.out.println("Avanzado: " + resueltosPorTecnico.getOrDefault("Tecnico Avanzado", 0L));

        long pendientes = tickets.stream().filter(ticket -> !ticket.isResuelto()).count();
        System.out.println("Pendientes: " + pendientes);
        Map<String, Integer> prioridadMap = Map.of(
                "baja", 1,
                "media", 2,
                "alta", 3
        );

        long totalResueltos = tickets.stream()
                .filter(Ticket::isResuelto)
                .count();

        System.out.println("Promedio de prioridad de tickets resueltos: " + totalResueltos);
    }
}
