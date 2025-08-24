package edu.dosw.lab.estructurales.Reto5Decorator;

public class CafeDecorator implements Topping {
    protected Topping topping;

    public CafeDecorator(Topping topping) {
        this.topping = topping;
    }

    public double getPrecio() {
        return topping.getPrecio();
    }

    public String getNombre() {
        return topping.getNombre();
    }
}
