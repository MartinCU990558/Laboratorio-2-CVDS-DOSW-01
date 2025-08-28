package edu.dosw.lab.estructurales.reto5;

public class CremaBatida extends listToppings {
    public CremaBatida(topping topping) {
        super(topping);
    }

    @Override
    public String getDescrip() {
        return topping.getDescrip() + ", Crema batida";
    }

    @Override
    public int getPrecio() {
        return topping.getPrecio() + 2000;
    }
}
 {
    
}
