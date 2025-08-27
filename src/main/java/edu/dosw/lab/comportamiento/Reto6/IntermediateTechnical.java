package edu.dosw.lab.comportamiento.Reto6;

public class IntermediateTechnical extends Technical{
    public IntermediateTechnical(Priority maxPriority){
        super(maxPriority);
    }

    @Override
    public String toString(){
        return "Técnico Intermedio";
    }

    @Override
    public boolean isResolve(Ticket ticket){
        return ticket.getLevel() == Difficult.INTERMEDIO &&
            ticket.getPriority().getLevel() <= maxPriority.getLevel();
    }
}