package edu.dosw.lab.estructurales.reto5;

public class CremaBatida extends ListToppings {
    public CremaBatida(Topping topping) {
        super(topping);
    }

    @Override
    public String getDescrip() {
        return topping.getDescrip() + ", Crema Batida";
    }

    @Override
    public int getPrecio() {
        return topping.getPrecio() + 2000;
    }
}
