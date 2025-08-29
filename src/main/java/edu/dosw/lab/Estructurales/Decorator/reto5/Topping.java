package edu.dosw.lab.Estructurales.Decorator.reto5;

public class Topping {
    private String name;
    private int price;

    public Topping(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" ($ ").append(price).append(")");
        return builder.toString();
    }
}
