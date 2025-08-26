package edu.dosw.lab.comportamiento;



public class Intermediatetechnician extends Technical {
    public intermediatetechnician(String name) {
        super(name);
    }
    @Override
    public boolean isResolve(Ticket ticket) {
        if (ticket.getLevel().equalsIgnoreCase("intermedio")) {
            System.out.println("Técnico intermedio resolvió el ticket: " + ticket.getDescription());
            return true;
        } else if (nextTechnical != null) {
            return nextTechnical.isResolve(ticket);
        }
        return false;
    }
}

