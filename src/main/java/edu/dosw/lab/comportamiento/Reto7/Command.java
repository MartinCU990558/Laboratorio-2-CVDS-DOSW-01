package edu.dosw.lab.comportamiento.Reto7;
interface Command {
    void undo();
    String getDescription();
    String getUser();
    boolean isUndone();
}
