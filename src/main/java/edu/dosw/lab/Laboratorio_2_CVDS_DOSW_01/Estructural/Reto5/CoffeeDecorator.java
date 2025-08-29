package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Estructural.Reto5;

public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }
}
