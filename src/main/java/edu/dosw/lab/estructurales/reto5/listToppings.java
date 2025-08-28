package edu.dosw.lab.estructurales.reto5;

public class listToppings implements topping {
    private  final String nombre;
    private final int precio;

    public listToppings(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
