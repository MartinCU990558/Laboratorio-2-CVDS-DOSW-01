package edu.dosw.lab.comportamiento.Punto_6;

public class TecnicoAvanzado extends Tecnico {
    
    @Override
    public boolean puedeResolver(Ticket ticket) {
        return ticket.getPrioridad().getValor() <= Prioridad.alta.getValor();
    }
    
    @Override
    public String getNombreTecnico() {
        return "Técnico Avanzado";
    }
}