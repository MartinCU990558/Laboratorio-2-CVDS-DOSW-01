package edu.dosw.lab.creacionales.reto3.Fabricas;

import edu.dosw.lab.creacionales.reto3.Vehiculo;

public interface VehiculoFactory {
    Vehiculo crearCarro();
    Vehiculo crearMoto();
    Vehiculo crearBicicleta();
    Vehiculo crearAvion();
    Vehiculo crearAvioneta();
    Vehiculo crearHelicoptero();
    Vehiculo crearJetSki();
    Vehiculo crearVelero();
    Vehiculo crearLancha();
}
