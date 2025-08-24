package edu.dosw.lab.estructurales;

public abstract class DecoratorCoffee extends Coffee {
    protected Coffee coffee;
    public DecoratorCoffee(Coffee coffee){
        this.coffee = coffee;
    }
    
}
