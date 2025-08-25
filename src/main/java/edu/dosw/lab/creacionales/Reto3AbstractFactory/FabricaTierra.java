package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public class FabricaTierra {
    public static Vehiculo crearVehiculo(int opcion, Categoria categoria) {
        return switch (opcion) {
            case 1 -> new Auto(categoria);
            case 2 -> new Moto(categoria);
            case 3 -> new Bicicleta(categoria);
            default -> null;
        };
    }
}
