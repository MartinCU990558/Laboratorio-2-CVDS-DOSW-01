package edu.dosw.lab.comportamiento.reto7;

public class ReproducirMusicaCommand implements Command {
    private String usuario;
    private boolean ejecutado;

    public ReproducirMusicaCommand(String usuario) {
        this.usuario = usuario;
        this.ejecutado = false;
    }

    @Override
    public String execute() {
        this.ejecutado = true;
        return "Música reproducida por " + usuario;
    }

    @Override
    public String undo() {
        if (ejecutado) {
            ejecutado = false;
            return "Música detenida (deshacer acción de " + usuario + ")";
        }
        return "La música ya estaba detenida";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getTipo() {
        return "ReproducirMusica";
    }
}