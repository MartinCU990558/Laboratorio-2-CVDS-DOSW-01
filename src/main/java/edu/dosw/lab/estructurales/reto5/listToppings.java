package edu.dosw.lab.estructurales.reto5;

public abstract class ListToppings implements Topping {
    protected Topping topping;

    public ListToppings(Topping topping) {
        this.topping = topping;
    }

    @Override
    public int getPrecio() {
        return topping.getPrecio();
    }

    @Override
    public String getDescrip() {
        return topping.getDescrip();
    }
}
