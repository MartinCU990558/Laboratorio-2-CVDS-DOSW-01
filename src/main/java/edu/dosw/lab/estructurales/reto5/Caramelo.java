package edu.dosw.lab.estructurales.reto5;

public class Caramelo extends ListToppings {
    public Caramelo(Topping Topping) {
        super(Topping);
    }

    @Override
    public String getDescrip() {
        return Topping.getDescrip() + ", Caramelo";
    }

    @Override
    public int getPrecio() {
        return Topping.getPrecio() + 1200;
    }
}
 {
    
}
