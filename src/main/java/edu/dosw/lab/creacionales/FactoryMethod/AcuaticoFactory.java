package edu.dosw.lab.creacionales.FactoryMethod;

public class AcuaticoFactory implements VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo(int modelo, String categoria) {
        switch (modelo) {
            case 1: return new JetSki(categoria);
            case 2: return new Lancha(categoria);
            case 3: return new Velero(categoria);
            default: return null;
        }
    }

    @Override
    public void mostrarModelos() {
        System.out.println("1. JetSki");
        System.out.println("2. Lancha");
        System.out.println("3. Velero");
        System.out.println("Ingrese opción: ");
    }
}