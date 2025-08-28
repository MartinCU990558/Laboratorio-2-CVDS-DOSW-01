package edu.dosw.lab.Comportamiento.reto6;

public class Basico extends SoporteTecnico {
    @Override
    public boolean resolver(Ticket ticket, Reporte reporte) {
        if(ticket.getNivel().equals("básico") && ticket.getPrioridad().equals("baja")) {
            ticket.setResueltoPor("básico");
            reporte.agregarResultado(ticket, "Técnico Básico resolvió el problema.");
            return true;
        } else if (siguiente != null) {
            return siguiente.resolver(ticket, reporte);
        }
        reporte.agregarResultado(ticket, "Ningún técnico disponible. Ticket pendiente de escalamiento.");
        return false;
    }
}
