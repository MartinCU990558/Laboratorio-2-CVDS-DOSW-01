package edu.dosw.lab.solid.Reto_1_TIENDA_DON_PEPE;

abstract class Cliente {

    protected String tipo;
    public String getTipo() { return tipo; }
    public abstract double calcularDescuento(double subtotal);

}