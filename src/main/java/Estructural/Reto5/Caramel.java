package Estructural.Reto5;

public class Caramel extends CoffeeDecorator {

    public Caramel(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Caramelo";
    }
    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 1200;
    }
}
