package edu.dosw.lab.comportamiento.ChainOfResponsibility.reto6;

public class TecnicoBasico extends Tecnico {
    public TecnicoBasico(String nombre) {
        super(nombre, "basico");
    }

    @Override
    public boolean puedeResolver(Ticket ticket) {
        return ticket.getNivel().equalsIgnoreCase("basico") &&
                (ticket.getPrioridad().equalsIgnoreCase("baja") ||
                        ticket.getPrioridad().equalsIgnoreCase("media"));
    }
}