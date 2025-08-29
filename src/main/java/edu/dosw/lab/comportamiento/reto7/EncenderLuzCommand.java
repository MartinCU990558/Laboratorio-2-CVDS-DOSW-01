package edu.dosw.lab.comportamiento.reto7;

public class EncenderLuzCommand implements Command {
    private String usuario;
    private boolean ejecutado;

    public EncenderLuzCommand(String usuario) {
        this.usuario = usuario;
        this.ejecutado = false;
    }

    @Override
    public String execute() {
        this.ejecutado = true;
        return "Luz encendida por " + usuario;
    }

    @Override
    public String undo() {
        if (ejecutado) {
            ejecutado = false;
            return "Luz apagada (deshacer acción de " + usuario + ")";
        }
        return "La luz ya estaba apagada";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getTipo() {
        return "EncenderLuz";
    }
}