package edu.dosw.lab.comportamiento.Punto_6;

public class TecnicoIntermedio extends Tecnico {
    
    @Override
    public boolean puedeResolver(Ticket ticket) {
        return (ticket.getDificultad() == Dificultad.basico || 
                ticket.getDificultad() == Dificultad.intermedio) && 
               ticket.getPrioridad().getValor() <= Prioridad.alta.getValor();
    }
    
    @Override
    public String getNombreTecnico() {
        return "Técnico Intermedio";
    }
}