package edu.dosw.lab.Comportamiento.Reto7;

public interface Command {

    void execute();

    void undo();

    String getUsuario();

    String getDescripcion();

    boolean fueDeshecha();

    void marcarDeshecha();

}
