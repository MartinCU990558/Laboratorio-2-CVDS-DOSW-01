package edu.dosw.lab.Comportamiento.Reto6;

public class Ticket {
    private int numeroTicket;
    private String nivel;
    private String prioridad;
    private String descripcion;
    private boolean resuelto;
    private String tecnico;

    public Ticket(int numeroTicket, String nivel, String prioridad, String descripcion, boolean resuelto) {
        this.numeroTicket = numeroTicket;
        this.nivel = nivel;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.resuelto = false;
        this.tecnico = "Pendiente";
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }
    public String getNivel() {
        return nivel;
    }
    public String getPrioridad() {
        return prioridad;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public boolean isResuelto() {
        return resuelto;
    }
    public String getTecnico() {
        return tecnico;
    }

    public void marcarResuelto(String tecnico) {
        this.resuelto = true;
        this.tecnico = tecnico;
    }
}
