package edu.dosw.lab.estructurales.reto5;

public class Cafe {
    private int precio;

    public Cafe() {
        this.precio = 1000;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void addPrecio(int precio) {
        this.precio += precio;
    }
}