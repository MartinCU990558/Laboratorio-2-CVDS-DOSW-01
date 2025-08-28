package edu.dosw.lab.estructurales.reto5;

public class Caramelo extends listToppings {
    public Caramelo(topping topping) {
        super(topping);
    }

    @Override
    public String getDescrip() {
        return topping.getDescrip() + ", Caramelo";
    }

    @Override
    public int getPrecio() {
        return topping.getPrecio() + 1200;
    }
}
 {
    
}
