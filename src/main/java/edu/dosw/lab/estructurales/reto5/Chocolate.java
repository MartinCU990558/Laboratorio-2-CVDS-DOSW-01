package edu.dosw.lab.estructurales.reto5;

public class Chocolate extends ToppingDecorator {
    private int precio = 1500;
    public Chocolate(Topping topping){
        super(topping);
    }

    @Override
    public int getPrecio(){
        return topping.getPrecio() + precio;
    }
    
    @Override
    public String getDescripcion(){
        return topping.getDescripcion() + "+ Chocolate";
    }
}
