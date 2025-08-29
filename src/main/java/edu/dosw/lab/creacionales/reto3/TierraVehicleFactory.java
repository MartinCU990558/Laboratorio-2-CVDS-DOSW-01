package edu.dosw.lab.creacionales.reto3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class TierraVehicleFactory implements AbstractVehicleFactory{
    private final Map<String, Function<String, Vehicle>> registry = new HashMap<>();

    public TierraVehicleFactory() {
        registry.put("Auto", Auto::new);
        registry.put("Bici", Bici::new);
        registry.put("Moto", Moto::new);
    }
    @Override
    public Vehicle create(String model, String category) {
        Function<String, Vehicle> constructor = registry.get(model);
        return constructor.apply(category);
    }
}
