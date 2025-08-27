package edu.dosw.lab.comportamiento.Reto6;

public class BasicTechnical extends Technical{
    public BasicTechnical(Priority maxPriority){
        super(maxPriority);
    }

    @Override
    public String toString(){
        return "Técnico Básico";
    }

    @Override
    public boolean isResolve(Ticket ticket){
        return ticket.getLevel() == Difficult.BASICO &&
            ticket.getPriority().getLevel() <= maxPriority.getLevel();
    }
}