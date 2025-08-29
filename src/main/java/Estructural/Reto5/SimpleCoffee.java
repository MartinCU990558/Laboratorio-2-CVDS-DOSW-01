package Estructural.Reto5;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Café base";
    }
    @Override
    public double getPrice() {
        return 2000;
    }
}
