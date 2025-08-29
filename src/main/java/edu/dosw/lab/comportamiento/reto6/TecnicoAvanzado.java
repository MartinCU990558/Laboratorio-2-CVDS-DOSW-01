package edu.dosw.lab.comportamiento.reto6;

import java.util.Locale;

public class TecnicoAvanzado extends Tecnico {
    public TecnicoAvanzado() {
        super("Técnico Avanzado");
    }

    @Override
    public String resolver(Ticket ticket) {
        String d = ticket.getDescripcion().toLowerCase(Locale.ROOT);
        boolean espInstalacion = d.contains("instalación") || d.contains("instalacion");
        boolean espServidor = d.contains("servidor");
        boolean especialidad = espInstalacion || espServidor;

        if (ticket.getNivel() == Nivel.AVANZADO && especialidad) {
            return "Técnico Avanzado resolvió el problema.";
        }
        if (especialidad && ticket.getPrioridad() == Prioridad.ALTA) {
            return "Técnico Avanzado resolvió el problema.";
        }
        return pasarAlSiguiente(ticket);
    }
}