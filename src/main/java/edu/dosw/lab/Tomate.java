package edu.dosw.lab;

public class Tomate extends Ingredientes {
    private double precio;
    private String nombre;

    public Tomate() {
        precio = 2.000;
        nombre = "Tomate";
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
