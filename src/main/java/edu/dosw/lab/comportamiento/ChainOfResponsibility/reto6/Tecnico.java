package edu.dosw.lab.comportamiento.ChainOfResponsibility.reto6;

public abstract class Tecnico {
    protected String nombre;
    protected String nivel;
    protected Tecnico siguiente;

    public Tecnico(String nombre, String nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void setSiguiente(Tecnico siguiente) {
        this.siguiente = siguiente;
    }

    public abstract boolean puedeResolver(Ticket ticket);

    public String resolver(Ticket ticket) {
        if (puedeResolver(ticket)) {
            return nombre + " resolvió el problema.";
        } else if (siguiente != null) {
            return nombre + " no pudo resolver. " + siguiente.resolver(ticket);
        } else {
            return "Ningún técnico disponible. Ticket pendiente de escalamiento.";
        }
    }
}
