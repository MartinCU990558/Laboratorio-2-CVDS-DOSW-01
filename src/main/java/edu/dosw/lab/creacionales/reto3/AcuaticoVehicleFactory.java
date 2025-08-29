package edu.dosw.lab.creacionales.reto3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class AcuaticoVehicleFactory implements AbstractVehicleFactory {
    private final Map<String, Function<String, Vehicle>> registry = new HashMap<>();

    public AcuaticoVehicleFactory() {
        registry.put("Lancha", Lancha::new);
        registry.put("Velero", Velero::new);
        registry.put("JetSki", JetSki::new);
    }
    @Override
    public Vehicle create(String model, String category) {
        Function<String, Vehicle> constructor = registry.get(model);
        return constructor.apply(category);
    }
}
