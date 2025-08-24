package edu.dosw.lab.estructurales.Reto5Decorator;

public class Menta extends CafeDecorator {
    private double precio;
    private String nombre;

    public Menta(Topping topping) {
        super(topping);
        precio = 1.300;
        nombre = "Menta";
    }

    public double getPrecio() {
        return precio + super.getPrecio();
    }

    public String getNombre() {
        return nombre + " + " + super.getNombre();
    }
}
