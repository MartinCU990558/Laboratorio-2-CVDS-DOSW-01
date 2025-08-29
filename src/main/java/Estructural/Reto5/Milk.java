package Estructural.Reto5;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Leche";
    }
    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 500;
    }
}
