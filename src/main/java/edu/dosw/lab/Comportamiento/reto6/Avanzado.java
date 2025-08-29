package edu.dosw.lab.Comportamiento.reto6;

public class Avanzado extends SoporteTecnico {
    @Override
    public boolean resolver(Ticket ticket, Reporte reporte) {
        if(ticket.getNivel().equals("avanzado") || ticket.getNivel().equals("intermedio")) {
            ticket.setResueltoPor("avanzado");
            reporte.agregarResultado(ticket, "Técnico Avanzado resolvió el problema.");
            return true;
        } else if (siguiente != null) {
            return siguiente.resolver(ticket, reporte);
        }
        reporte.agregarResultado(ticket, "Ningún técnico disponible. Ticket pendiente de escalamiento.");
        return false;
    }
}
