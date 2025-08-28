package edu.dosw.lab.estructurales.reto5;

public class Leche extends ListToppings {
    public Leche(Topping topping) {
        super(topping);
    }

    @Override
    public String getDescrip() {
        return topping.getDescrip() + ", Leche";
    }

    @Override
    public int getPrecio() {
        return topping.getPrecio() + 1000;
    }
}
