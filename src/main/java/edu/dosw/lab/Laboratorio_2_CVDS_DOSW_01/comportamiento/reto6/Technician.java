package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto6;

import java.util.*;
import java.util.Set;

public class Technician {

    private final String name;
    private final Set<Ticket.Level> specialties;
    private final Ticket.Priority maxPriority;
    private Technician next;

    public Technician(String name, Set<Ticket.Level> specialties, Ticket.Priority maxPriority) {
        this.name = name;
        this.specialties = specialties;
        this.maxPriority = maxPriority;
    }

    public void setNext(Technician next) {
        this.next = next;
    }

    public void handle(Ticket ticket) {
        if (canHandle(ticket)) {
            ticket.markResolved(this.name, getCompetenceLevel());
            ticket.addLog(this.name + " resolvió el problema.");
        } else {

            if (specialties.contains(ticket.getLevel())) {
                ticket.addLog(this.name + " no pudo resolver.");
            }
            if (next != null) {
                next.handle(ticket);
            } else {
                ticket.markEscalated();
                ticket.addLog("Ningún técnico disponible. Ticket pendiente de escalamiento.");
            }
        }
    }

    public Ticket.Level getCompetenceLevel() {
        Optional<Ticket.Level> max = specialties.stream().max(Comparator.comparingInt(Enum::ordinal));
        return max.orElse(Ticket.Level.BASICO);
    }

    private boolean canHandle(Ticket ticket) {
        boolean levelOk = specialties.contains(ticket.getLevel());
        boolean priorityOk = ticket.getPriority().getValue() <= maxPriority.getValue();
        return levelOk && priorityOk;
    }

    @Override
    public String toString() {
        return name;
    }
}

