package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.ChainOfResponsability.Reto6;

public class Ticket {
    private String descripcion;
    private Nivel nivel;
    private Prioridad prioridad;

    public Ticket(String descripcion, Nivel nivel, Prioridad prioridad) {
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Ticket: " + descripcion +
                " | Nivel: " + nivel +
                " | Prioridad: " + prioridad;
    }
}
