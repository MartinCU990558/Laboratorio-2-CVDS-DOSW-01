package edu.dosw.lab.comportamiento.reto6;

import java.util.Locale;

public class TecnicoIntermedio extends Tecnico {
    public TecnicoIntermedio() {
        super("Técnico Intermedio");
    }

    @Override
    public String resolver(Ticket ticket) {
        String d = ticket.getDescripcion().toLowerCase(Locale.ROOT);
        boolean especialidad = d.contains("instalación") || d.contains("instalacion");
        boolean prioridadOK = ticket.getPrioridad() == Prioridad.BAJA || ticket.getPrioridad() == Prioridad.MEDIA;
        if (ticket.getNivel() == Nivel.INTERMEDIO && prioridadOK && especialidad) {
            return "Técnico Intermedio resolvió el problema.";
        }
        return pasarAlSiguiente(ticket);
    }
}