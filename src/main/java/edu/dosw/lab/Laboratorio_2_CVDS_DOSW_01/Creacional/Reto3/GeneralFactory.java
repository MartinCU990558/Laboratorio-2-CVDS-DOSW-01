package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Creacional.Reto3;

public class GeneralFactory {
    public static Vehicle createVehicle(String type, String category) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car(category, 180, 50_000_000, "Aire acondicionado + GPS");
            case "moto":
                return new Moto(category, 160, 20_000_000, "Casco + ABS");
            case "bike":
                return new Bike(category, 40, 1_000_000, "Marchas + Luces");
            case "boat":
                return new Boat(category, 80, 70_000_000, "Motor fuera de borda");
            case "sailboat":
                return new Sailboat(category, 60, 90_000_000, "Velas reforzadas");
            case "jetski":
                return new JetSki(category, 100, 60_000_000, "Asiento doble");
            case "plane":
                return new Plane(category, 500, 500_000_000, "Cabina premium");
            case "smallplane":
                return new SmallPlane(category, 250, 150_000_000, "Instrumentos básicos de vuelo");
            case "helicopter":
                return new Helicopter(category, 300, 400_000_000, "Sistema de navegación aérea");
            default: throw new IllegalArgumentException("Vehículo no válido");
        }
    }
}
