package edu.dosw.lab.Estructurales;

import edu.dosw.lab.Util.ToppingInfo;

public class Topping  extends  Decoration{
    private ToppingInfo topping;
    public Topping(Coffee coffee, ToppingInfo topping) {
        super(coffee);
        this.topping = topping;
    }
    @Override
    public String description() {
        return coffee.description()+ "+" + topping.getNombre();
    }
    @Override
    public int cost() {
        return coffee.cost() + topping.getPrecio();
    }
}
