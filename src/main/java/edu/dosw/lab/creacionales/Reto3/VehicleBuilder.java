package edu.dosw.lab.creacionales.Reto3;

public class VehicleBuilder {
    private ModelVehicle model;
    private CategoryVehicle category;
    private StrategyCategory strategy;
    
    public VehicleBuilder setModel(ModelVehicle model) {
        this.model = model;
        return this;
    }
    
    public VehicleBuilder setCategory(CategoryVehicle category) {
        this.category = category;
        this.strategy = createStrategy(category);
        return this;
    }
    
    private StrategyCategory createStrategy(CategoryVehicle category) {
        switch (category) {
            case ECONOMICO: return new StrategyEconomic();
            case LUJO: return new StrategyLuxury();
            case USADO: return new StrategyUsed();
            default: return new StrategyEconomic();
        }
    }
    
    public Vehicle build() {
        return VehicleFactory.createVehicle(model, category, strategy);
    }
}