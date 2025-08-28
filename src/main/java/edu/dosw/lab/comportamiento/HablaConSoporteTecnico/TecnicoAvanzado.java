package edu.dosw.lab.comportamiento.HablaConSoporteTecnico;

public class TecnicoAvanzado extends Tecnico {

    public TecnicoAvanzado() {
        super("Avanzado");
    }

    @Override
    public boolean manejarTicket(Ticket ticket) {
        if (ticket.getNivelComplejidad().equalsIgnoreCase("avanzado")) {
            System.out.println("Técnico Avanzado manejando ticket: " + ticket.getDescripcionProblema() + " con prioridad " + ticket.getNivelPrioridad());
            ticket.setTecnicoAsignado("avanzado");
            return true;
        } else {
            System.out.println("Ningún técnico disponible. Ticket pendiente de escalamineto. " + ticket.getDescripcionProblema());
        } return false;
    }
}
