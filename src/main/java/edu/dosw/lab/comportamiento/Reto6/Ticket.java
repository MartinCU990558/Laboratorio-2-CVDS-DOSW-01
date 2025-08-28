package edu.dosw.lab.comportamiento.Reto6;

public class Ticket {
    private String descripcion;
    private String nivel;
    private String prioridad;
    private String resueltoPor;

    public Ticket(String descripcion, String nivel, String prioridad) {
        this.descripcion = descripcion;
        this.nivel = nivel.toLowerCase();
        this.prioridad = prioridad.toLowerCase();
        this.resueltoPor = "pendiente";
    }

    public String getDescripcion() { return descripcion; }
    public String getNivel() { return nivel; }
    public String getPrioridad() { return prioridad; }
    public String getResueltoPor() { return resueltoPor; }
    public void setResueltoPor(String resueltoPor) { this.resueltoPor = resueltoPor; }
}