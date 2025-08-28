package edu.dosw.lab.Comportamiento.Reto6;

public class TecnicoBasico extends SoporteHandler{
    @Override
    public void manejarTicket(Ticket ticket) {
        if (ticket.getNivel().equalsIgnoreCase("básico")  && ticket.getPrioridad().equalsIgnoreCase("baja")) {
            ticket.marcarResuelto("Tecnico Basico");
        } else {
            System.out.println("Ticket " + ticket.getNumeroTicket() + ": Técnico Básico no pudo resolver.");
            if (siguiente != null) siguiente.manejarTicket(ticket);
        }
    }
}
