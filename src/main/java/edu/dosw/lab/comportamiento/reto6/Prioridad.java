package edu.dosw.lab.comportamiento.reto6;

public enum Prioridad {
    BAJA(1), MEDIA(2), ALTA(3);

    private final int valor;
    Prioridad(int valor) { this.valor = valor; }
    public int getValor() { return valor; }
}