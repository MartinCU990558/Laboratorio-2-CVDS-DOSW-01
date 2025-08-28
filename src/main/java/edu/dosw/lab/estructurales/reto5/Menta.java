package edu.dosw.lab.estructurales.reto5;

public class Menta extends ListToppings {
    public Menta(Topping topping) {
        super(Topping);
    }

    @Override
    public String getDescrip() {
        return Topping.getDescrip() + ", Menta";
    }

    @Override
    public int getPrecio() {
        return Topping.getPrecio() + 1300;
    }
}
 {
    
}
