package edu.dosw.lab;

public class Carne extends Ingredientes {
    private double precio;
    private String nombre;

    public Carne() {
        precio = 10.000;
        nombre = "Carne";
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
