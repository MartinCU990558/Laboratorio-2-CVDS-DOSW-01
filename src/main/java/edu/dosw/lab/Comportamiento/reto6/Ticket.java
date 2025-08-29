package edu.dosw.lab.Comportamiento.reto6;

public class Ticket {
    private int id;
    private String nivel;
    private String prioridad;
    private String descripcion;
    private String resueltoPor = null;

    public Ticket(int id, String nivel, String prioridad, String descripcion) {
        this.id = id;
        this.nivel = nivel.toLowerCase();
        this.prioridad = prioridad.toLowerCase();
        this.descripcion = descripcion;
    }

    public int getId() { return id; }
    public String getNivel() { return nivel; }
    public String getPrioridad() { return prioridad; }
    public String getDescripcion() { return descripcion; }

    public String getResueltoPor() { return resueltoPor; }
    public void setResueltoPor(String resueltoPor) { this.resueltoPor = resueltoPor; }
}

