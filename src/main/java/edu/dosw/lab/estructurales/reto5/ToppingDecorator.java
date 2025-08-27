package edu.dosw.lab.estructurales.reto5;

public abstract class ToppingDecorator implements Topping {
    protected Topping topping;

    public ToppingDecorator(Topping topping){
        this.topping = topping;
    }
    @Override
    public String getDescripcion(){
        return topping.getDescripcion();
    }

    @Override
    public int getPrecio() {
        return topping.getPrecio();
    }
}