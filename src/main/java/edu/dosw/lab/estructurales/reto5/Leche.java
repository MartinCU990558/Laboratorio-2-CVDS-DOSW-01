package edu.dosw.lab.estructurales.reto5;

public class Leche extends ToppingDecorador {
    public Leche(Topping topping) {
        super(topping);
    }

    @Override
    public String getDescrip() {
        return topping.getDescrip() + ", Leche";
    }

    @Override
    public double getPrecio() {
        return topping.getPrecio() + 1000;
    }
}

