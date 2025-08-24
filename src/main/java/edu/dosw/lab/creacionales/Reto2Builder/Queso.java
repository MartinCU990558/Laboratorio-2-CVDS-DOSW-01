package edu.dosw.lab.creacionales.Reto2Builder;

public class Queso extends Ingredientes {
    private double precio;
    private String nombre;

    public Queso() {
        precio = 5.000;
        nombre = "Queso";
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
