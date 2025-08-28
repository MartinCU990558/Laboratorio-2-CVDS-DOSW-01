package edu.dosw.lab.estructurales.reto5;

public class CremaBatida extends ListToppings {
    public CremaBatida(Topping topping) {
        super(Topping);
    }

    @Override
    public String getDescrip() {
        return Topping.getDescrip() + ", Crema batida";
    }

    @Override
    public int getPrecio() {
        return Topping.getPrecio() + 2000;
    }
}
 
    

