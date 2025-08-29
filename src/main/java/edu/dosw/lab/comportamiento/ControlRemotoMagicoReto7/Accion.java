package edu.dosw.lab.comportamiento.ControlRemotoMagicoReto7;

public class Accion {
    protected String usuario;
    protected String descripcion;
    protected boolean deshecha = false;

    public Accion(String usuario, String descripcion) {
        this.usuario = usuario;
        this.descripcion = descripcion;
    }

    public void ejecutar() {}
    public void deshacer() {
        deshecha = true;
    }

    public String getDescripcion() {
        return descripcion + (deshecha ? " (deshecha)" : "");
    }

    public String getUsuario() {
        return usuario;
    }

    public boolean isDeshecha() {
        return deshecha;
    }
}
