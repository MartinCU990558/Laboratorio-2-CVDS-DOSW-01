package edu.dosw.lab.creacionales.reto2;

public class Ingrediente {
    private String nombre;
    private double precio;
 
    public Ingrediente(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public double getPrecio() {
        return precio;
    }
 
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}
