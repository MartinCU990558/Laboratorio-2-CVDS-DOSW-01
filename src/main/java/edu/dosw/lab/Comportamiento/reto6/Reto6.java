package edu.dosw.lab.Comportamiento.reto6;

import java.util.*;

public class Reto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Ticket> tickets = new ArrayList<>();

        System.out.print("¿Cuántos tickets desea ingresar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Ticket " + (i + 1) + " ---");
            int id = i + 1;

            System.out.print("Nivel (básico / intermedio / avanzado): ");
            String nivel = sc.nextLine();

            System.out.print("Prioridad (baja / media / alta): ");
            String prioridad = sc.nextLine();

            System.out.print("Descripción: ");
            String descripcion = sc.nextLine();

            tickets.add(new Ticket(id, nivel, prioridad, descripcion));
        }

        GestorTickets gestor = new GestorTickets();
        Reporte reporte = new Reporte();

        gestor.procesarTickets(tickets, reporte);
        reporte.mostrarResultados();

        sc.close();
    }
}
