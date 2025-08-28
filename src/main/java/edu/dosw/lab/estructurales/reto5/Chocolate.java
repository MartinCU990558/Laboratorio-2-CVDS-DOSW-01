package edu.dosw.lab.estructurales.reto5;

public class Chocolate extends listToppings {
    public Chocolate(topping topping) {
        super(topping);
    }

    @Override
    public String getDescrip() {
        return topping.getDescrip() + ", Chocolate";
    }

    @Override
    public int getPrecio() {
        return topping.getPrecio() + 1500;
    }
}
 {
    
}
