package edu.dosw.lab.comportamiento.HablaConSoporteTecnico;

public class TecnicoBasico extends Tecnico {

    public TecnicoBasico() {
        super("Basico");
    }

    @Override
    public boolean manejarTicket(Ticket ticket) {
        if (ticket.getNivelComplejidad().equals("Basico")) {
            System.out.println("Técnico Básico manejando ticket: " + ticket.getDescripcionProblema() + " con prioridad " + ticket.getNivelPrioridad());
            return true;
        } else if (siguienteTecnico != null) {
            System.out.println("Técnico Básico escalando ticket: " + ticket.getDescripcionProblema() + " a técnico " + siguienteTecnico.nivelSoporte);
            return siguienteTecnico.manejarTicket(ticket);
        } else {
            System.out.println("Ningún técnico disponible. Ticket pendiente de escalamineto. " + ticket.getDescripcionProblema());
            return false;
        }
    }

}
