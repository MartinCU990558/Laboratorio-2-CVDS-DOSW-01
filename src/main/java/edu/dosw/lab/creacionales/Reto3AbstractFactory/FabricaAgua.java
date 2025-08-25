package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public class FabricaAgua {
    public static Vehiculo crearVehiculo(int opcion, Categoria categoria) {
        return switch (opcion) {
            case 1 -> new JetSki(categoria);
            case 2 -> new Lancha(categoria);
            case 3 -> new Velero(categoria);
            default -> null;
        };
    }
}

