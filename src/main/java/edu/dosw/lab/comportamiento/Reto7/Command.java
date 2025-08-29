package edu.dosw.lab.comportamiento.Reto7;

public interface Command {
    public void execute();
    public void undo();
    public String getUser();
    public String getDescription();
}
