package edu.dosw.lab.Comportamiento.reto6;

public abstract class SoporteTecnico {
    protected SoporteTecnico siguiente;

    public void setSiguiente(SoporteTecnico siguiente) {
        this.siguiente = siguiente;
    }

    public abstract boolean resolver(Ticket ticket, Reporte reporte);
}

