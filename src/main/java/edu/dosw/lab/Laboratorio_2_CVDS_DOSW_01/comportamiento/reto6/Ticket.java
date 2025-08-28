package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ticket {

    public static enum Level {
        BASICO, INTERMEDIO, AVANZADO
    }

    public static enum Priority {
        BAJA(1), MEDIA(3), ALTA(5);

        private final int value;
        Priority(int v) { this.value = v; }
        public int getValue() { return value; }
    }

    private final int id;
    private final Level level;
    private final Priority priority;
    private final String description;
    private final List<String> logs = new ArrayList<>();

    private String resolvedBy = null;
    private Level resolvedByLevel = null;
    private boolean escalated = false;


    public Ticket(int id, Level level, Priority priority, String description) {
        this.id = id;
        this.level = Objects.requireNonNull(level);
        this.priority = Objects.requireNonNull(priority);
        this.description = Objects.requireNonNull(description);
    }

    public int getId() { return id; }
    public Level getLevel() { return level; }
    public Priority getPriority() { return priority; }
    public String getDescription() { return description; }
    public String getResolvedBy() { return resolvedBy; }
    public Ticket.Level getResolvedByLevel() { return resolvedByLevel; }
    public boolean isEscalated() { return escalated; }

    public void addLog(String msg) {
        if (msg != null) logs.add(msg);
    }

    public List<String> getLogs() {
        return new ArrayList<>(logs);
    }

    public void markResolved(String technicianName, Level technicianLevel) {
        this.resolvedBy = technicianName;
        this.resolvedByLevel = technicianLevel;
        this.escalated = false;
    }

    public void markEscalated() {
        this.escalated = true;
    }
}

