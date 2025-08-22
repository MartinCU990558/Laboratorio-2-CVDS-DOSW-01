package edu.dosw.lab.solid.reto1;

public class Producto {
    private String nombre;
    private double precio;
    private String descripcion;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }


}
