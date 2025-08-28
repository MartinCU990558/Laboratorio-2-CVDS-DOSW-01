package edu.dosw.lab.comportamiento.HablaConSoporteTecnico;

public class Ticket {

    private String nivelComplejidad;
    private String nivelPrioridad;
    private String descripcionProblema;
    private String tecnicoAsignado;


    public Ticket(String nivelComplejidad, String nivelPrioridad, String descripcionProblema, String tecnicoAsignado) {
        this.nivelComplejidad = nivelComplejidad;
        this.nivelPrioridad = nivelPrioridad;
        this.descripcionProblema = descripcionProblema;
        this.tecnicoAsignado = tecnicoAsignado;
    }

    public String getNivelPrioridad() {return nivelPrioridad;}
    public String getDescripcionProblema() {return descripcionProblema;}
    public String getNivelComplejidad() {return nivelComplejidad;}
    public void setTecnicoAsignado(String tecnicoAsignado) {this.tecnicoAsignado = tecnicoAsignado;}
    public String getTecnicoAsignado() {return tecnicoAsignado;}

}