package edu.dosw.lab.estructurales.Reto5Decorator;

public class NuevoTopping extends CafeDecorator {
    private double precio;
    private String nombre;

    public NuevoTopping(Topping topping, double precio, String nombre) {
        super(topping);
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre + " + " + super.getNombre();
    }

    public double getPrecio() {
        return precio + super.getPrecio();
    }
}
