package edu.dosw.lab.comportamiento.Reto6;

public class AdvanceTechnical extends Technical {
    public AdvanceTechnical(Priority maxPriority){
        super(maxPriority);
    }
    
    @Override
    public String toString(){
        return "Técnico Avanzado";
    }

    @Override
    public boolean isResolve(Ticket ticket){
        return ticket.getLevel() == Difficult.AVANZADO ||
               ticket.getLevel() == Difficult.INTERMEDIO; 
    }
}