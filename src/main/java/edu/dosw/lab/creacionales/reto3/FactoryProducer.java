package edu.dosw.lab.creacionales.reto3;

import java.util.HashMap;
import java.util.Map;

public class FactoryProducer {
    private static final Map<String,AbstractVehicleFactory> factories = new HashMap<>();

    static{
        factories.put("Tierra", new TierraVehicleFactory());
        factories.put("Acuatico", new AcuaticoVehicleFactory());
        factories.put("Aereo", new AereoVehicleFactory());
    }
    public static AbstractVehicleFactory getFactory(String type){
        AbstractVehicleFactory factory = factories.get(type);
        return factory;
    }
}
