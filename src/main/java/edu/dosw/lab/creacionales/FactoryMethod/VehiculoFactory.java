package edu.dosw.lab.creacionales.FactoryMethod;

public interface VehiculoFactory {
    Vehiculo crearVehiculo(int modelo, String categoria);
    void mostrarModelos();
}
