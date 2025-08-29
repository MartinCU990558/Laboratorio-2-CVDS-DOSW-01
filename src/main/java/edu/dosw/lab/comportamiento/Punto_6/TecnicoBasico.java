package edu.dosw.lab.comportamiento.Punto_6;

public class TecnicoBasico extends Tecnico {
    
    @Override
    public boolean puedeResolver(Ticket ticket) {
        return ticket.getDificultad() == Dificultad.basico && 
               ticket.getPrioridad().getValor() <= Prioridad.media.getValor();
    }
    
    @Override
    public String getNombreTecnico() {
        return "Técnico Básico";
    }
}