package edu.dosw.lab.comportamiento.reto6;

public abstract class Tecnico {
    protected Tecnico siguiente;
    protected final String nombre;

    public Tecnico(String nombre) {
        this.nombre = nombre;
    }

    public void setSiguiente(Tecnico siguiente) {
        this.siguiente = siguiente;
    }

    public abstract String resolver(Ticket ticket);

    protected String pasarAlSiguiente(Ticket ticket) {
        if (siguiente == null) {
            return "Ningún técnico disponible. Ticket pendiente de escalamiento.";
        }
        String msg = siguiente.resolver(ticket);
        if (msg.startsWith("Técnico")) {
            return nombre + " no pudo resolver. " + msg;
        }
        return msg;
    }
}