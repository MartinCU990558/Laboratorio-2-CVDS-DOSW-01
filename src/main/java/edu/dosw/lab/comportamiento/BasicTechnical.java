package edu.dosw.lab.comportamiento;

public class BasicTechnical extends Technical {
    public BasicTechnical(String name) {
        super(name);
    }
    @Override
    public boolean isResolve(Ticket ticket) {
        if (ticket.getLevel().equalsIgnoreCase("básico")) {
            System.out.println("Técnico Básico resolvió el ticket: " + ticket.getDescription());
            return true;
        } else if (nextTechnical != null) {
            return nextTechnical.isResolve(ticket);
        }
        return false;
    }
}
