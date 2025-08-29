package edu.dosw.lab.creacionales.reto3;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class AereoVehicleFactory implements AbstractVehicleFactory {
    private final Map<String, Function<String, Vehicle>> registry = new HashMap<>();

    public AereoVehicleFactory() {
        registry.put("Avion", Avion::new);
        registry.put("Avioneta", Avioneta::new);
        registry.put("Helicoptero", Helicoptero::new);
    }
    @Override
    public Vehicle create(String model, String category) {
        Function<String, Vehicle> constructor = registry.get(model);
        return constructor.apply(category);
    }
}
