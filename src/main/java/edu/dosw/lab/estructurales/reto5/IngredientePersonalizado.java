package edu.dosw.lab.estructurales.reto5;

public class IngredientePersonalizado extends ListToppings {
    private final String nombre;
    private final int precioExtra;

    public IngredientePersonalizado(Topping topping, String nombre, int precioExtra) {
        super(topping);
        this.nombre = nombre;
        this.precioExtra = precioExtra;
    }

    @Override
    public String getDescrip() {
        return topping.getDescrip() + ", " + nombre;
    }

    @Override
    public int getPrecio() {
        return topping.getPrecio() + precioExtra;
    }
}
