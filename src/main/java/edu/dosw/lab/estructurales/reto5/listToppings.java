package edu.dosw.lab.estructurales.reto5;

public abstract class listToppings implements topping {
    protected topping topping;

    public listToppings(topping Topping) {
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
