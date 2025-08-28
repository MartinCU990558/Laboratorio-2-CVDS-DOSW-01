package edu.dosw.lab.comportamiento.Reto6;

public class TecBasico implements Tecnico {
    private Tecnico siguiente;

    @Override
    public void setSiguiente(Tecnico siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void manejar(Ticket ticket) {

        if (ticket.getNivel().equals("basico") &&
                (ticket.getPrioridad().equals("baja") ||ticket.getPrioridad().equals("media") )) {

            ticket.setResueltoPor("Técnico Básico");

        } else {

            siguiente.manejar(ticket);
        }
    }
}
