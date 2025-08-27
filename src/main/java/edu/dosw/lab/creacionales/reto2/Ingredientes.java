package edu.dosw.lab.creacionales.reto2;

public abstract class Ingredientes {
    private String nombre;
    private int precio;

    public Ingredientes(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
