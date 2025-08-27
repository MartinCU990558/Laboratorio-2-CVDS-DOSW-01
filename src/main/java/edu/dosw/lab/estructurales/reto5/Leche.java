package edu.dosw.lab.estructurales.reto5;

public class Leche extends ToppingDecorator{
    private int precio=1000;
    
    public Leche(Topping topping) {
            super(topping);
        
    }

    @Override
    public String getDescripcion() {
        return topping.getDescripcion() + "+ Leche";
    }

    @Override
    public int getPrecio(){
        return topping.getPrecio() + precio;
    }
}