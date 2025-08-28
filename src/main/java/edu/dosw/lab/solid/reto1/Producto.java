package edu.dosw.lab.solid.reto1;

import java.util.List;

public class Producto {
    private String nombre;
    private double precioUnitaro;


    public Producto(String nombre, double precioUnitario){

        this.nombre = nombre;
        this.precioUnitaro = precioUnitario;

    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precioUnitaro;
    }

}
