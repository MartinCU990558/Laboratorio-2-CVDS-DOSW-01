package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.FactoryMethod.Reto3;

public class Moto implements Vehiculo {
    @Override
    public String getNombre() {
        return "Moto";
    }

    @Override
    public double getPrecio() {
        return 15000;
    }

    @Override
    public double getVelocidadMaxima() {
        return 120;
    }

    @Override public String getCategoria() { return "Base"; }


    @Override
    public String getEquipamiento() {
        return "Casco obligatorio, Espejos laterales";
    }
}