package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto7;

interface Command {
    String execute();
    String undo();
    String getDescription();
}
