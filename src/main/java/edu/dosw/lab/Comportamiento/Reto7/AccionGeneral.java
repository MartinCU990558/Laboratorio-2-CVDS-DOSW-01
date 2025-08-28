package edu.dosw.lab.Comportamiento.Reto7;

public abstract class AccionGeneral implements Accion {
    protected String usuario;
    protected boolean deshecha = false;
    protected String descripcion;

    public AccionGeneral(String usuario) {
        this.usuario = usuario;

    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public boolean seDeshizo(){
        return deshecha;
    }
}
