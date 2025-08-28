package edu.dosw.lab.estructurales.reto5;

public class Chocolate extends ToppingDecorador {
    public Chocolate(Topping topping) {
        super(topping);
    }

    @Override
    public String getDescrip() {
        return topping.getDescrip() + ", Chocolate";
    }

    @Override
    public double getPrecio() {
        return topping.getPrecio() + 1500;
    }
}
 {
    
}
