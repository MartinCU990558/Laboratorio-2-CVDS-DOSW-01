package edu.dosw.lab.comportamiento.ChainOfResponsibility.reto6;

public class TecnicoAvanzado extends Tecnico {
    public TecnicoAvanzado(String nombre) {
        super(nombre, "avanzado");
    }

    @Override
    public boolean puedeResolver(Ticket ticket) {
        return ticket.getNivel().equalsIgnoreCase("basico") ||
                ticket.getNivel().equalsIgnoreCase("intermedio") ||
                ticket.getNivel().equalsIgnoreCase("avanzado");
    }
}