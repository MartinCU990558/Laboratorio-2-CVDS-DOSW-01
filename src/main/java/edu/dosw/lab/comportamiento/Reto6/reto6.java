package edu.dosw.lab.comportamiento.Reto6;

import java.util.*;

public class reto6 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);


        Tecnico basico = new TecBasico();
        Tecnico intermedio = new TecIntermedio();
        Tecnico avanzado = new TecAvanzado();
        basico.setSiguiente(intermedio);
        intermedio.setSiguiente(avanzado);
        avanzado.setSiguiente(null);

        System.out.print("Ingrese el número de tickets: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Ticket> tickets = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTicket " + i + ":");

            System.out.print("Nivel: ");
            String nivel = sc.next().toLowerCase();
            System.out.print("Prioridad: ");
            String prioridad = sc.next().toLowerCase();
            sc.nextLine();
            System.out.print("Descripción: ");
            String desc = sc.nextLine();

            Ticket t = new Ticket(desc, nivel, prioridad);
            basico.manejar(t);
            tickets.add(t);
        }


        tickets.forEach(t -> System.out.println("Ticket: " + t.getDescripcion() + " -> " + t.getResueltoPor()));

        Estadisticas.generar(tickets);
    }
}