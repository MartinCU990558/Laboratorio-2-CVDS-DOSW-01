package edu.dosw.lab.comportamiento.HablaConSoporteTecnico;

public class Ticket {

    private String nivelComplejidad;
    private String nivelPrioridad;
    private String descripcionProblema;


    public Ticket(String nivelComplejidad, String nivelPrioridad, String descripcionProblema) {
        this.nivelComplejidad = nivelComplejidad;
        this.nivelPrioridad = nivelPrioridad;
        this.descripcionProblema = descripcionProblema;
    }

    public String getNivelPrioridad() {return nivelPrioridad;}
    public String getDescripcionProblema() {return descripcionProblema;}
    public String getNivelComplejidad() {return nivelComplejidad;}

}