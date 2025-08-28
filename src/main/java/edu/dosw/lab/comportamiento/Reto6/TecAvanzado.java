package edu.dosw.lab.comportamiento.Reto6;

public class TecAvanzado implements Tecnico {
    private Tecnico siguiente;

    @Override
    public void setSiguiente(Tecnico siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void manejar(Ticket ticket) {
        if (ticket.getNivel().equals("avanzado")) {
            ticket.setResueltoPor("Técnico Avanzado");
        } else if (siguiente != null) {
            siguiente.manejar(ticket);
        } else {
            ticket.setResueltoPor("pendiente");

        }
    }


}