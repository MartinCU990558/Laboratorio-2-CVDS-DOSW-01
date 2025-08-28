package edu.dosw.lab.Comportamiento.Reto7;

public interface Accion {
    public void ejecutar();
    public void deshecha();
    String getDescripcion();
    String getUsuario();
    boolean seDeshizo();
}
