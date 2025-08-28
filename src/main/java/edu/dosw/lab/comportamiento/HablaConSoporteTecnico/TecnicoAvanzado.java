package edu.dosw.lab.comportamiento.HablaConSoporteTecnico;

public class TecnicoAvanzado extends Tecnico {

    public TecnicoAvanzado() {
        super("Avanzado");
    }

    @Override
    public void manejarTicket(Ticket ticket) {
        if (ticket.getNivelComplejidad().equals("Avanzado")) {
            System.out.println("Técnico Avanzado manejando ticket: " + ticket.getDescripcionProblema() + " con prioridad " + ticket.getNivelPrioridad());
        } else {
            System.out.println("Ningún técnico disponible. Ticket pendiente de escalamineto. " + ticket.getDescripcionProblema());
        }
    }
}
