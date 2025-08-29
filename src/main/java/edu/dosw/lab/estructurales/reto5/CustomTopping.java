package edu.dosw.lab.estructurales.reto5;

public class CustomTopping extends ToppingDecorator {
    private String nombre;
    private int precio;

    public CustomTopping(Cafe cafe, String nombre, int precio) {
        super(cafe);
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getDescripcion() { return cafe.getDescripcion() + " + " + nombre; }
    public int getPrecio() { return cafe.getPrecio() + precio; }
}
