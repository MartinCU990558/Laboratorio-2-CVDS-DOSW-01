package edu.dosw.lab.estructurales.Decorator.reto5;

public class ToppingDecorator implements Cafe {
    private Cafe cafe;
    private String nombre;
    private int precio;

    public ToppingDecorator(Cafe cafe, String nombre, int precio) {
        this.cafe = cafe;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + " + nombre;
    }

    @Override
    public int getPrecio() {
        return cafe.getPrecio() + precio;
    }
}