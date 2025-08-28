package edu.dosw.lab.estructurales.reto5;

public class Leche extends ListToppings {
    public Leche(Topping topping) {
        super(Topping);
    }

    @Override
    public String getDescrip() {
        return Topping.getDescrip() + ", Leche";
    }

    @Override
    public int getPrecio() {
        return Topping.getPrecio() + 1000;
    }
}

