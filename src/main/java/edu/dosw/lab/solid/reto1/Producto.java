package edu.dosw.lab.solid.reto1;

public class Producto {
    private String nombre;
    private int precio;
    private String descripcion;

    public Producto(String nombre, int precio) {
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