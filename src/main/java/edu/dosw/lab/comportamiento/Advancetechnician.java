package edu.dosw.lab.comportamiento;

public class Advancetechnician extends Technical {

    public Advancetechnician(String name) {
        super(name);

    @Override
    public boolean isResolve(Ticket ticket) {
        if (ticket.getLevel().equalsIgnoreCase("avanzado")) {
            System.out.println("Técnico avanzado resolvió el ticket: " + ticket.getDescription());
            return true;
        } else if (nextTechnical != null) {
            return nextTechnical.isResolve(ticket);
        }
        return false;
    }
}


}
