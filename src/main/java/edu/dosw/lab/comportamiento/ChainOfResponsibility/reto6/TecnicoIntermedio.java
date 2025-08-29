package edu.dosw.lab.comportamiento.ChainOfResponsibility.reto6;

public class TecnicoIntermedio extends Tecnico {
    public TecnicoIntermedio(String nombre) {
        super(nombre, "intermedio");
    }

    @Override
    public boolean puedeResolver(Ticket ticket) {
        return (ticket.getNivel().equalsIgnoreCase("basico") ||
                ticket.getNivel().equalsIgnoreCase("intermedio")) &&
                !ticket.getPrioridad().equalsIgnoreCase("alta");
    }
}