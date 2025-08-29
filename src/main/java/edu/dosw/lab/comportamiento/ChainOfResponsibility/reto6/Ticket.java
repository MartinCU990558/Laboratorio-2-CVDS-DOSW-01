package edu.dosw.lab.comportamiento.ChainOfResponsibility.reto6;

public class Ticket {
    private String nivel;
    private String prioridad;
    private String descripcion;
    private int id;

    public Ticket(int id,String nivel,String prioridad,String descripcion){
        this.descripcion=descripcion;
        this.nivel=nivel;
        this.prioridad=prioridad;
        this.id=id;
    }
    public int getId(){return id;
    }
    public String getNivel() {return nivel;
    }
    public String getPrioridad() {return prioridad;
    }
    public String getDescripcion() {return descripcion;
    }



}
