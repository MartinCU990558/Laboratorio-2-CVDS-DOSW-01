package edu.dosw.lab.creacionales.FactoryMethod;

public class AereoFactory implements VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo(int modelo, String categoria) {
        switch (modelo) {
            case 1: return new Avion(categoria);
            case 2: return new Avioneta(categoria);
            case 3: return new Helicoptero(categoria);
            default: return null;
        }
    }

    @Override
    public void mostrarModelos() {
        System.out.println("1. Avión");
        System.out.println("2. Avioneta");
        System.out.println("3. Helicóptero");
        System.out.println("Ingrese opción: ");
    }
}