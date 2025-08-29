package edu.dosw.lab.comportamiento.reto7;

public class AbrirPuertaCommand implements Command {
    private String usuario;
    private boolean ejecutado;

    public AbrirPuertaCommand(String usuario) {
        this.usuario = usuario;
        this.ejecutado = false;
    }

    @Override
    public String execute() {
        this.ejecutado = true;
        return "Puerta abierta por " + usuario;
    }

    @Override
    public String undo() {
        if (ejecutado) {
            ejecutado = false;
            return "Puerta cerrada (deshacer acción de " + usuario + ")";
        }
        return "La puerta ya estaba cerrada";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getTipo() {
        return "AbrirPuerta";
    }
}