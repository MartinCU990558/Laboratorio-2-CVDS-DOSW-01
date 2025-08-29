package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.ChainOfResponsability.Reto6;

public interface Tecnico {
    void setSiguiente(Tecnico siguiente);
    boolean resolver(Ticket ticket);
}

