package edu.dosw.lab.creacionales.Reto2Builder;

public class NuevoIngrediente extends Ingredientes {
    private double precio;
    private String nombre;

    public NuevoIngrediente() {
        precio = 4.000;
        nombre = "Tocino";
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
