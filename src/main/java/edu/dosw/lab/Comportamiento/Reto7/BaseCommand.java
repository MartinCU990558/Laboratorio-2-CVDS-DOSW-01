package edu.dosw.lab.Comportamiento.Reto7;

public abstract class BaseCommand implements Command {

    protected String usuario;
    protected boolean deshecha = false;

    public BaseCommand(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public boolean fueDeshecha() {
        return deshecha;
    }

    public void marcarDeshecha() {
        deshecha = true;
    }


}
