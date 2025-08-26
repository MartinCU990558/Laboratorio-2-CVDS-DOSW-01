package edu.dosw.lab.comportamiento;
import java.util.*;
public class SoporteTecnico {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero De tickets: ");
        int number_tickets = sc.nextInt();
        List<Ticket> tickets = new ArrayList<>();
        for(int i = 1 ; i < number_tickets; i++ ){
            System.out.println("Ticket" + " "+ i + ":");
            System.out.print("Nivel: ");
            String nivel = sc.nextLine();
            System.out.print("Prioridad: ");
            String prioridad = sc.nextLine();
            System.out.print("Descripcion: ");
            String descripcion = sc.nextLine();
            tickets.add(new Ticket(nivel,prioridad,descripcion));   
        }
        System.out.println("-- Estadísticas ---");
        Map<String,Integer> estadisticas = new HashMap<>();

    }
}