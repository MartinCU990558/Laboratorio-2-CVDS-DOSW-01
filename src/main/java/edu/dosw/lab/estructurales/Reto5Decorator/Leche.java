package edu.dosw.lab.estructurales.Reto5Decorator;

public class Leche extends CafeDecorator {
    private double precio;
    private String nombre;

    public Leche(Topping topping) {
        super(topping);
        precio = 1.000;
        nombre = "Leche";
    }

    public double getPrecio() {
        return precio + super.getPrecio();
    }

    public String getNombre() {
        return nombre + " + " + super.getNombre();
    }
}
