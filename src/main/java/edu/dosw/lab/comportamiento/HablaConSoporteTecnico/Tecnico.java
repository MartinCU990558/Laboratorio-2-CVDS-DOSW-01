package edu.dosw.lab.comportamiento.HablaConSoporteTecnico;

public abstract class Tecnico {

    protected String nivelSoporte;
    protected Tecnico siguienteTecnico;

    public Tecnico(String nivelSoporte) {
        this.nivelSoporte = nivelSoporte;
    }

    public void setSiguienteTecnico(Tecnico siguienteTecnico) {this.siguienteTecnico = siguienteTecnico;}

    public abstract void manejarTicket(Ticket ticket);
}
