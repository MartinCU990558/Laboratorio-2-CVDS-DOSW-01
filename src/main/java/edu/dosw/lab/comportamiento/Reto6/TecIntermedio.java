package edu.dosw.lab.comportamiento.Reto6;

public class TecIntermedio implements Tecnico {
    private Tecnico siguiente;
    @Override
    public void setSiguiente(Tecnico siguiente) {
        this.siguiente = siguiente;
    }
    @Override
    public void manejar(Ticket ticket) {

        if (ticket.getNivel().equals("intermedio") &&
                (ticket.getPrioridad().equals("baja") || ticket.getPrioridad().equals("media") || ticket.getPrioridad().equals("alta"))) {

            ticket.setResueltoPor("Técnico intermedio");

        } else {
            siguiente.manejar(ticket);
        }
    }
}