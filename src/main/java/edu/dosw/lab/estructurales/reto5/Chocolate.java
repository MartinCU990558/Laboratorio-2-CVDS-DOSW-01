package edu.dosw.lab.estructurales.reto5;

public class Chocolate extends ListToppings {
    public Chocolate(Topping topping) {
        super(topping);
    }

    @Override
    public String getDescrip() {
        return Topping.getDescrip() + ", Chocolate";
    }

    @Override
    public int getPrecio() {
        return Topping.getPrecio() + 1500;
    }
}
 {
    
}
