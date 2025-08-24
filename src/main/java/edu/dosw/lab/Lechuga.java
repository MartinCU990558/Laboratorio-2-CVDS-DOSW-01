package edu.dosw.lab;

public class Lechuga extends Ingredientes {
    private double precio;
    private String nombre;

    public Lechuga() {
        precio = 2.000;
        nombre = "Lechuga";
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
