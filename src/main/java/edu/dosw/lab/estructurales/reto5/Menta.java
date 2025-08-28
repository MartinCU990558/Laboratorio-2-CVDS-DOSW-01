package edu.dosw.lab.estructurales.reto5;

public class Menta extends ToppingDecorador {
    public Menta(Topping topping) {
        super(topping);
    }

    @Override
    public String getDescrip() {
        return topping.getDescrip() + ", Menta";
    }

    @Override
    public double getPrecio() {
        return topping.getPrecio() + 1300;
    }
}
 {
    
}
