package edu.dosw.lab.estructurales.reto5;

public class CremaBatida extends ToppingDecorator{
    private int precio=2000;

    public CremaBatida(Topping topping) {
        super(topping);
    }

    @Override
    public int getPrecio(){
        return topping.getPrecio() + precio;
    }

    @Override
    public String getDescripcion(){
        return topping.getDescripcion() + "+ Crema Batida";

    }
}