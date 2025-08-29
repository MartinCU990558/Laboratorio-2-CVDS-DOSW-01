package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Decorador.Reto5;

public class Decorador implements Cafe {
    private Cafe cafe;
    private String nombre;
    private double precio;

    public Decorador(Cafe cafe, String nombre, double precio) {
        this.cafe = cafe;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + " + nombre;
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + precio;
    }
}

