package edu.dosw.lab.estructurales.reto5;

public class Menta extends listToppings {
    public Menta(topping topping) {
        super(topping);
    }

    @Override
    public String getDescrip() {
        return topping.getDescrip() + ", Menta";
    }

    @Override
    public int getPrecio() {
        return topping.getPrecio() + 1300;
    }
}
 {
    
}
