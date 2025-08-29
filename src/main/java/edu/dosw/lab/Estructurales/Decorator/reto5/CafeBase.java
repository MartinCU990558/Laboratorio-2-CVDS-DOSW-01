package edu.dosw.lab.Estructurales.Decorator.reto5;

public class CafeBase implements Cafe {
    private final int precioBase = 2000;

    @Override
    public String getDescripcion() {
        return "Café base";
    }

    @Override
    public int getPrecio() {
        return precioBase;
    }
}
