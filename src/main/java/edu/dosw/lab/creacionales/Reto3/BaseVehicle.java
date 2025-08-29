package edu.dosw.lab.creacionales.Reto3;

public class BaseVehicle implements Vehicle {
    protected String type;
    protected CategoryVehicle category;
    protected StrategyCategory strategy;
    protected int baseSpeed;
    protected long basePrice;

    public BaseVehicle(String type, CategoryVehicle category, StrategyCategory strategy, int baseSpeed, long basePrice){
        this.type = type;
        this.category = category;
        this.strategy = strategy;
        this.baseSpeed = baseSpeed;
        this.basePrice = basePrice;
    }
    @Override 
    public String getType(){
        return type; 
    }

    @Override public String getCategory(){
        return category.toString().charAt(0) + category.toString().substring(1).toLowerCase();
    }

    @Override public int getMaxSpeed(){
        return strategy.calculateSpeed(baseSpeed); 
    }

    @Override public long getPrice(){ 
        return strategy.calculatePrice(basePrice); 
    }

    @Override public String getEquipment(){
        return strategy.equipment(); 
    }
    
}
