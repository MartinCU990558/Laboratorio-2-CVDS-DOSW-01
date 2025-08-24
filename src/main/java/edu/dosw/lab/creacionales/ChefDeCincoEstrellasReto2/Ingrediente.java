package edu.dosw.lab.creacionales.ChefDeCincoEstrellasReto2;



public class Ingrediente {
    private final String nombre;
    private final int precio;

    public Ingrediente(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
