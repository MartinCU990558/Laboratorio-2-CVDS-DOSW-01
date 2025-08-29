package edu.dosw.lab.comportamiento.Reto7;

public interface Comando {
    void ejecutar();
    void deshacer();
    String getDescripcion();
    String getUsuario();
    String getTipoDispositivo();
}