package edu.dosw.lab.comportamiento.Punto_6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Ticket> tickets = new ArrayList<>();
        DetSiguiente Tecnicos = new DetSiguiente();
        System.out.println("SISTEMA DE SOPORTE TÉCNICO");
        System.out.println("Ingrese el número de tickets a procesar:");
        int numTickets = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < numTickets; i++) {
            System.out.println("\nTicket #" + (i + 1));
            System.out.println("Nivel (basico, intermedio, avanzado):");
            Dificultad dificultad = Dificultad.valueOf(scanner.nextLine());
            System.out.println("Prioridad (baja, media, alta):");
            Prioridad prioridad = Prioridad.valueOf(scanner.nextLine());
            System.out.println("Descripción:");
            String descripcion = scanner.nextLine();
            Ticket ticket = new Ticket(descripcion, dificultad, prioridad);
            tickets.add(ticket);
        }
        System.out.println("\n--- Resultados ---");
        for (Ticket ticket : tickets) {
            String resultado = Tecnicos.procesarTicket(ticket);
            System.out.println("Ticket " + ticket.getId() + ": " + resultado);
        }
        CalcularStats estadisticas = new CalcularStats();
        estadisticas.generarEstadisticas(tickets);
        scanner.close();
    }
}