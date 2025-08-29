package edu.dosw.lab.comportamiento.Punto_6;

public abstract class Tecnico {
    protected Tecnico siguiente;
    
    public void tecnicoElegido(Tecnico siguiente) {
        this.siguiente = siguiente;
    }
    
    public abstract boolean puedeResolver(Ticket ticket);
    public abstract String getNombreTecnico();
    
    public String resolverTicket(Ticket ticket) {
        if (puedeResolver(ticket)) {
            ticket.setResuelto(true);
            ticket.setResolutor(getNombreTecnico());
            return getNombreTecnico() + " resolvió el problema.";
        } else if (siguiente != null) {
            return getNombreTecnico() + " no pudo resolver. " + siguiente.resolverTicket(ticket);
        } else {
            return "Ningún técnico disponible. Ticket pendiente de escalamiento.";
        }
    }
}