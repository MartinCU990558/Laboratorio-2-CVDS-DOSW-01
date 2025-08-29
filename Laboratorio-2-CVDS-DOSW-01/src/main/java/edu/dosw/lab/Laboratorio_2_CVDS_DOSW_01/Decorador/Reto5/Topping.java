package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Decorador.Reto5;

public class Topping {
    private String nombre;
    private double precio;

    public Topping(String nombre, double precio) {
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

