package edu.dosw.lab.creacionales.Reto2Builder;

public class SalsaEspecial extends Ingredientes {
    private double precio;
    private String nombre;

    public SalsaEspecial() {
        precio = 3.000;
        nombre = "Salsa Especial";
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
