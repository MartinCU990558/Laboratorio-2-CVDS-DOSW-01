package edu.dosw.lab.comportamiento.HablaConSoporteTecnico;

public class TecnicoIntermedio extends Tecnico {
    @Override
    public boolean manejarTicket(Ticket ticket) {
        if (ticket.getNivelComplejidad().equalsIgnoreCase("Intermedio")) {
            System.out.println("El técnico de nivel " + nivelSoporte + " está manejando el ticket con prioridad " + ticket.getNivelPrioridad() + ": " + ticket.getDescripcionProblema());
            return true;
        } else if (siguienteTecnico != null) {
            System.out.println("El técnico de nivel " + nivelSoporte + " no puede manejar el ticket con complejidad " + ticket.getNivelComplejidad() + ". Pasando al siguiente técnico.");
            return siguienteTecnico.manejarTicket(ticket);
        } else {
            System.out.println("El ticket con complejidad " + ticket.getNivelComplejidad() + " no puede ser manejado. No hay más técnicos disponibles.");
        } return false;
    }

}
