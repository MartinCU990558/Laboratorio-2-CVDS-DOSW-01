package edu.dosw.lab.estructurales.reto5;

public class Caramelo extends ListToppings {
    public Caramelo(Topping topping) {
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
