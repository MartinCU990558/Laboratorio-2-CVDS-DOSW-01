package edu.dosw.lab.creacionales.FactoryMethod;

public class TierraFactory implements VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo(int modelo, String categoria) {
        switch (modelo) {
            case 1: return new Moto(categoria);
            case 2: return new Auto(categoria);
            case 3: return new Bicicleta(categoria);
            default: return null;
        }
    }

    @Override
    public void mostrarModelos() {
        System.out.println("1. Moto");
        System.out.println("2. Auto");
        System.out.println("3. Bicicleta");
        System.out.println("Ingrese opción: ");
    }
}