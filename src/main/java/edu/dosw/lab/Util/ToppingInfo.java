package edu.dosw.lab.Util;

public class ToppingInfo {
    private String name;
    private int price;

    public ToppingInfo(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getNombre() {
        return name;
    }

    public int getPrecio() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
