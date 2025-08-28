package edu.dosw.lab.Comportamiento.Reto6;

public abstract class SoporteHandler {
    protected SoporteHandler siguiente;

    public void setSiguiente(SoporteHandler siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejarTicket(Ticket ticket);
}
