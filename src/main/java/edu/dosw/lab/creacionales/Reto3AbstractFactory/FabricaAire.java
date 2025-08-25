package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public class FabricaAire {
    public static Vehiculo crearVehiculo(int opcion, Categoria categoria) {
        return switch (opcion) {
            case 1 -> new Avion(categoria);
            case 2 -> new Avioneta(categoria);
            case 3 -> new Helicoptero(categoria);
            default -> null;
        };
    }
}
