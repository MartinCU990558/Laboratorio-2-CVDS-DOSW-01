package edu.dosw.lab.creacionales.Reto2Builder;

public class Pan extends Ingredientes {
    private double precio;
    private String nombre;

    public Pan() {
        precio = 3.000;
        nombre = "Pan";
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
