package edu.dosw.lab.estructurales.reto5;

public abstract class ListToppings implements Topping {
    protected Topping Topping;

    public ListToppings(Topping Topping) {
        this.Topping = Topping;
    }

    @Override
    public int getPrecio() {
        return Topping.getPrecio();
    }

    @Override
    public String getDescrip() {
        return Topping.getDescrip();
    }

}
