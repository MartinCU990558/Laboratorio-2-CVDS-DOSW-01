package edu.dosw.lab.estructurales.reto5;

public class NuevoTopping extends ToppingDecorator{
    private int precio;
    private String nombre;

    public NuevoTopping(Topping topping,String nombre, int precio){
        super(topping);
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int getPrecio(){
        return topping.getPrecio() + precio;
    }

    @Override
    public String getDescripcion(){
        return  nombre + "+" + topping.getDescripcion();
    }
}
