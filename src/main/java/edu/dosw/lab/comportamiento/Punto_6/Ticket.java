package edu.dosw.lab.comportamiento.Punto_6;


public class Ticket {
    private static int contador = 1;
    private final int id;
    private final String descripcion;
    private final Dificultad dificultad;
    private final Prioridad prioridad;
    private boolean resuelto;
    private String resolutor;
    public Ticket(String descripcion, Dificultad dificultad, Prioridad prioridad) {
        this.id = contador++;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
        this.prioridad = prioridad;
        this.resuelto = false;
        this.resolutor = null;
    }
    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public Dificultad getDificultad() { return dificultad; }
    public Prioridad getPrioridad() { return prioridad; }
    public boolean isResuelto() { return resuelto; }
    public String getResolutor() { return resolutor; }
    public void setResuelto(boolean resuelto) { this.resuelto = resuelto; }
    public void setResolutor(String resolutor) { this.resolutor = resolutor; }
    @Override
    public String toString() {
        return "Ticket " + id + ": " + descripcion + " (" + dificultad + ", " + prioridad + ")";
    }
}
