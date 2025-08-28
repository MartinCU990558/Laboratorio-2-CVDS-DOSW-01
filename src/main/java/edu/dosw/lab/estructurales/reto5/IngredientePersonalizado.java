package edu.dosw.lab.estructurales.reto5;

public class IngredientePersonalizado extends ListToppings {
    private final String nombre;
    private final int precioExtra;

    public IngredientePersonalizado(Topping topping, String nombre, int precioExtra) {
        super(Topping);
        this.nombre = nombre;
        this.precioExtra = precioExtra;
    }

    @Override
    public String getDescrip() {
        return Topping.getDescrip() + ", " + nombre;
    }

    @Override
    public int getPrecio() {
        return Topping.getPrecio() + precioExtra;
    }
}
