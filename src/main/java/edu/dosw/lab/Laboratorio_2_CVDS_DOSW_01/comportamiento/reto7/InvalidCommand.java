package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto7;

public class InvalidCommand implements Command {
    private final String message;

    public InvalidCommand() {
        this.message = "Acción inválida";
    }

    @Override
    public String execute() {
        return message;
    }

    @Override
    public String undo() {
        return "Nada que deshacer";
    }

    @Override
    public String getDescription() {
        return message;
    }
}
