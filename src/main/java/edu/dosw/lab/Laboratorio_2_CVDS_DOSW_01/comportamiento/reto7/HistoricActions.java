package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto7;

public class HistoricActions {
    public final Command command;
    public final String user;
    public final boolean undoRequested;
    public boolean wasUndone = false;

    public HistoricActions(Command command, String user, boolean undoRequested) {
        this.command = command;
        this.user = user;
        this.undoRequested = undoRequested;
    }
}
