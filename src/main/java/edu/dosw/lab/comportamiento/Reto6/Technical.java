package edu.dosw.lab.comportamiento.Reto6;

public abstract class Technical {
    protected Priority maxPriority;
    protected Technical nexTechnical;

    public Technical(Priority maxPriority){
        this.maxPriority = maxPriority;
    }

    public void setNext(Technical nexTechnical){
        this.nexTechnical = nexTechnical;
    }

    public void attends(Ticket ticket){
        if (isResolve(ticket)) {
            ticket.setSolve(this.toString());
        } else if (nexTechnical != null) {
            if (ticket.getLevel().name().equalsIgnoreCase(this.toString().replace("Técnico ", ""))) {
                ticket.addResult(this.toString() + " no pudo resolver.");
            }
            nexTechnical.attends(ticket);
        } else {
            ticket.addResult("Ningún técnico disponible. Ticket pendiente de escalamiento.");
        }
    }

    public abstract boolean isResolve(Ticket ticket);
}
