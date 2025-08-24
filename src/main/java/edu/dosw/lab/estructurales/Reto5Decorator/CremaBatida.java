package edu.dosw.lab.estructurales.Reto5Decorator;

public class CremaBatida extends CafeDecorator {
    private double precio;
    private String nombre;

    public CremaBatida(Topping topping) {
        super(topping);
        precio = 2.000;
        nombre = "Crema Batida";
    }

    public double getPrecio() {
        return precio + super.getPrecio();
    }

    public String getNombre() {
        return nombre + " + " + super.getNombre();
    }
}
