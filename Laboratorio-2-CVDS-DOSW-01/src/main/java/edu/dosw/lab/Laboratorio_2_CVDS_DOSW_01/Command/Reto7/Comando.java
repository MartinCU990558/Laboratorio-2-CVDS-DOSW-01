package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Command.Reto7;

public interface Comando {
    void ejecutar();
    void deshacer();
    String getDescripcion();
    String getUsuario();
}
