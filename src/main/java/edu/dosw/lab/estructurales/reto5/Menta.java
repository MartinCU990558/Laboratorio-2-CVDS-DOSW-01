package edu.dosw.lab.estructurales.reto5;

public class Menta extends ToppingDecorator{
    private int precio = 1200;

    public Menta(Topping topping) {
            super(topping);
        }

    @Override
    public int getPrecio(){
        return topping.getPrecio() + precio;
    }

    @Override
    public String getDescripcion(){
        return topping.getDescripcion() + " + Menta";
    }
}