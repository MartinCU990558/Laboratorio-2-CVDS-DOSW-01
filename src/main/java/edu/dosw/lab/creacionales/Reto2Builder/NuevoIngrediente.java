package edu.dosw.lab.creacionales.Reto2Builder;

public class NuevoIngrediente extends Ingredientes {
    private double precio;
    private String nombre;

    public NuevoIngrediente(String nombre, double precio) {
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
