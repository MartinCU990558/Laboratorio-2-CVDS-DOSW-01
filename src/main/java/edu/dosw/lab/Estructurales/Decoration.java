package edu.dosw.lab.Estructurales;

public abstract class Decoration implements Coffee {
    protected Coffee coffee;
    public Decoration(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String description() {
        return coffee.description();
    }
    @Override
    public int cost() {
        return coffee.cost();
    }
}
