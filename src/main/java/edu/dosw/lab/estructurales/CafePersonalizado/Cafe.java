package edu.dosw.lab.estructurales.CafePersonalizado;


import java.util.ArrayList;
import java.util.List;

/**public class Cafe {
    private CafeBase base;
    private List<Topping> toppings;

    public Cafe() {
        this.base = new CafeBase();
        this.toppings = new ArrayList<>();
    }

    public void agregarTopping(Topping topping) {
        toppings.add(topping);
    }

    public String getDescripcion() {
        StringBuilder desc = new StringBuilder(base.getDescripcion());
        for (Topping t : toppings) {
            desc.append(" + ").append(t.getNombre());
        }
        return desc.toString();
    }

    public double getPrecio() {
        double total = base.getPrecio();
        for (Topping t : toppings) {
            total += t.getPrecio();
        }
        return total;
    }
}**/
