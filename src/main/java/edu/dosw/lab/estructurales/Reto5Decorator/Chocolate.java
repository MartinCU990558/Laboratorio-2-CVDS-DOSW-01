package edu.dosw.lab.estructurales.Reto5Decorator;

public class Chocolate extends CafeDecorator {
    private double precio;
    private String nombre;

    public Chocolate(Topping topping) {
        super(topping);
        precio = 1.500;
        nombre = "Chocolate";
    }

    public double getPrecio() {
        return precio + super.getPrecio();
    }

    public String getNombre() {
        return nombre + " + " + super.getNombre();
    }
}
