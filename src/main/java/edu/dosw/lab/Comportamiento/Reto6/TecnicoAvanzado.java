package edu.dosw.lab.Comportamiento.Reto6;

public class TecnicoAvanzado extends SoporteHandler{
    @Override
    public void manejarTicket(Ticket ticket) {
        if (ticket.getNivel().equalsIgnoreCase("avanzado")
        || (ticket.getNivel().equalsIgnoreCase("intermedio") && ticket.getPrioridad().equalsIgnoreCase("alta"))){
            ticket.marcarResuelto("Tecnico Avanzado");
        } else {
            System.out.println("Ticket " + ticket.getNumeroTicket() + ": Ningun tecnico disponible. Ticket pendiente de escalamiento.");
        }
    }
}
