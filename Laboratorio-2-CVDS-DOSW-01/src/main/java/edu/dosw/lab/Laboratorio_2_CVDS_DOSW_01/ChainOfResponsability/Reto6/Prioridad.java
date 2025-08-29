package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.ChainOfResponsability.Reto6;

public enum Prioridad {
    BAJA(1), MEDIA(2), ALTA(3);

    private int valor;

    Prioridad(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

