package edu.dosw.lab.comportamiento.reto6;

public class Ticket {
    private final Nivel nivel;
    private final Prioridad prioridad;
    private final String descripcion;

    public Ticket(Nivel nivel, Prioridad prioridad, String descripcion) {
        this.nivel = nivel;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
    }

    public Nivel getNivel() { return nivel; }
    public Prioridad getPrioridad() { return prioridad; }
    public String getDescripcion() { return descripcion; }

    @Override
    public String toString() {
        return "Ticket{" +
                "nivel=" + nivel +
                ", prioridad=" + prioridad +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
