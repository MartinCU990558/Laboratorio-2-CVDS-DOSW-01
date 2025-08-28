package edu.dosw.lab.estructurales.reto5;

public class CremaBatida extends ToppingDecorador {
    public CremaBatida(Topping topping) {
        super(topping);
    }

    @Override
    public String getDescrip() {
        return topping.getDescrip() + ", Crema batida";
    }

    @Override
    public double getPrecio() {
        return topping.getPrecio() + 2000;
    }
}
 {
    
}
