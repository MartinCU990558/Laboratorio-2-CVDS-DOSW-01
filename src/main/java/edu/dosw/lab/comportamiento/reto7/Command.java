package edu.dosw.lab.comportamiento.reto7;

public interface Command {
    String execute();
    String undo();
    String getUsuario();
    String getTipo();
}