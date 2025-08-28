package edu.dosw.lab.Comportamiento.Reto6;

public class TecnicoIntermedio extends SoporteHandler{
    @Override
    public void manejarTicket(Ticket ticket) {
        if (ticket.getNivel().equalsIgnoreCase("intermedio")
                && ticket.getPrioridad().equalsIgnoreCase("media")) {
            ticket.marcarResuelto("Tecnico Intermedio");
        } else {
            System.out.println("Ticket " + ticket.getNumeroTicket() + ": Técnico Intermedio no pudo resolver.");
            if (siguiente != null) siguiente.manejarTicket(ticket);
        }
    }
}
