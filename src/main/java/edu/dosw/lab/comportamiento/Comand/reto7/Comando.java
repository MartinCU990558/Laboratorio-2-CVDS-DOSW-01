package edu.dosw.lab.comportamiento.Comand.reto7;

interface Comando {
    void ejecutar();
    void deshacer();
    String getDescripcion();
    String getUsuario();
}

