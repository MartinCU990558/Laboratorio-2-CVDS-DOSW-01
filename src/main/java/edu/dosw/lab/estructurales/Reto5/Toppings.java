package edu.dosw.lab.estructurales.Reto5;

public class Toppings extends DecoratorCoffee {
    private String name;
    private double price;
    public Toppings(Coffee coffee, String name , double price){
        super(coffee);
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice(){
        return coffee.getPrice() + price;
    }
    @Override
    public String getDescription(){
        return coffee.getDescription() + ", " + name;
    }
    
}
