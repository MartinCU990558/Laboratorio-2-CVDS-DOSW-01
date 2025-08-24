package edu.dosw.lab.estructurales.Reto5Decorator;

public class Cafe implements Topping {
    @Override
    public double getPrecio() {
        return 2.000;
    }

    @Override
    public String getNombre() {
        return "Cafe Base ";
    }
}
