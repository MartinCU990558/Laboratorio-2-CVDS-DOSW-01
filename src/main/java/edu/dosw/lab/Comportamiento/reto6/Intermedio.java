package edu.dosw.lab.Comportamiento.reto6;

public class Intermedio extends SoporteTecnico {
    @Override
    public boolean resolver(Ticket ticket, Reporte reporte) {

        if(ticket.getNivel().equals("intermedio") &&
                (ticket.getPrioridad().equals("media") || ticket.getPrioridad().equals("baja"))) {
            ticket.setResueltoPor("intermedio");
            reporte.agregarResultado(ticket, "Técnico Intermedio resolvió el problema.");
            return true;
        }
        else if(ticket.getNivel().equals("intermedio") && siguiente != null) {
            boolean resuelto = siguiente.resolver(ticket, reporte);
            if(resuelto) {
                reporte.prependirNota(ticket, "Técnico Intermedio no pudo resolver. ");
            }
            return resuelto;
        }
        else if (siguiente != null) {
            return siguiente.resolver(ticket, reporte);
        }

        reporte.agregarResultado(ticket, "Ningún técnico disponible. Ticket pendiente de escalamiento.");
        return false;
    }
}
