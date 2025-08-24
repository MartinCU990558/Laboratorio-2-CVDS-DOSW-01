package edu.dosw.lab.solid.Reto1TiendaDonPepe;

public abstract class Cliente {
    protected String tipo;

    public Cliente(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() { return tipo; }
    public abstract double calcularDescuento(double subtotal);



}