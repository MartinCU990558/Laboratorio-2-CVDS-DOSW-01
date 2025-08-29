package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Command.Reto7;
public class Puerta {
    private boolean abierta = false;

    public void abrir() {
        abierta = true;
    }

    public void cerrar() {
        abierta = false;
    }

    public boolean isAbierta() {
        return abierta;
    }

    @Override
    public String toString() {
        return "Puerta " + (abierta ? "abierta" : "cerrada");
    }
}
