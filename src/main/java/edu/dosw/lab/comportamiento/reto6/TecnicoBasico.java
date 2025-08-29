package edu.dosw.lab.comportamiento.reto6;

import java.util.Locale;

public class TecnicoBasico extends Tecnico {
    public TecnicoBasico() {
        super("Técnico Básico");
    }

    @Override
    public String resolver(Ticket ticket) {
        String d = ticket.getDescripcion().toLowerCase(Locale.ROOT);
        boolean especialidad = d.contains("login");
        if (ticket.getNivel() == Nivel.BASICO && ticket.getPrioridad() == Prioridad.BAJA && especialidad) {
            return "Técnico Básico resolvió el problema.";
        }
        return pasarAlSiguiente(ticket);
    }
}
