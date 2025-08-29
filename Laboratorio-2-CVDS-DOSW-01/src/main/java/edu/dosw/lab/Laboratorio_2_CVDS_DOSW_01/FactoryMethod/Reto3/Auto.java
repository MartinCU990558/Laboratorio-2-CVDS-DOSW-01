package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.FactoryMethod.Reto3;

public class Auto implements Vehiculo {
    @Override public String getNombre() { return "Auto"; }
    @Override public double getPrecio() { return 50000000; }
    @Override public double getVelocidadMaxima() { return 180; }
    @Override public String getCategoria() { return "Base"; }  
    @Override public String getEquipamiento() { return "Aire acondicionado + GPS"; }
}
