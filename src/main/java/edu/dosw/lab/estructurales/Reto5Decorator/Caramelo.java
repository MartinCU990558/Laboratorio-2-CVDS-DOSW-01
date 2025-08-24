package edu.dosw.lab.estructurales.Reto5Decorator;

public class Caramelo extends CafeDecorator {
    private double precio;
    private String nombre;

    public Caramelo(Topping topping) {
        super(topping);
        precio = 1.200;
        nombre = "Caramelo";
    }

    public double getPrecio() {
        return precio + super.getPrecio();
    }

    public String getNombre() {
        return nombre + " + " + super.getNombre();
    }
}
