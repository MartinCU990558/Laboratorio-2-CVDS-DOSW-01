package edu.dosw.lab.creacionales.Reto3;

public class VehicleFactory {
    public static Vehicle createVehicle(ModelVehicle model, CategoryVehicle category, StrategyCategory strategy){
        switch (model) {
            case AUTO: return new LandVehicle("Auto", category, strategy, 150, 25000000L);
            case BICICLETA: return new LandVehicle("Bicicleta", category, strategy, 25, 500000L);
            case MOTO: return new LandVehicle("Moto", category, strategy, 120, 8000000L);
            case LANCHA: return new AcuaticVehicle("Lancha", category, strategy, 80, 25000000L);
            case VELERO: return new AcuaticVehicle("Velero", category, strategy, 30, 15000000L);
            case JETSKI: return new AcuaticVehicle("Jet Ski", category, strategy, 100, 10000000L);
            case AVION: return new AirVehicle("Avión", category, strategy, 800, 200000000L);
            case AVIONETA: return new AirVehicle("Avioneta", category, strategy, 270, 250000000L);
            case HELICOPTERO: return new AirVehicle("Helicóptero", category, strategy, 290, 123000000L);
            default: return new LandVehicle("Auto", category, strategy, 150, 43000000L);
        }
    }
    
}
