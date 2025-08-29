package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Creacional.Reto3;

public class Sailboat implements Vehicle {
    private final String category;
    private final int maxSpeed;
    private final double price;
    private final String equipment;

    public Sailboat(String category, int maxSpeed, double price, String equipment) {
        this.category = category;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.equipment = equipment;
    }

    @Override public String getType() { return "Velero"; }
    @Override public String getCategory() { return category; }
    @Override public int getMaxSpeed() { return maxSpeed; }
    @Override public double getPrice() { return price; }
    @Override public String getEquipment() { return equipment; }
}

