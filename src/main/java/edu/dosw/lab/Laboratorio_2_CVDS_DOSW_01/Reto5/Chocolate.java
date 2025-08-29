package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Reto5;

public class Chocolate extends CoffeeDecorator {

    public Chocolate(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Chocolate";
    }
    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 1000;
    }
}
