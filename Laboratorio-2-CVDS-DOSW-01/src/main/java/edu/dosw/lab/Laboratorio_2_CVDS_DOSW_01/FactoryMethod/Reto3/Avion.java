package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.FactoryMethod.Reto3;

public class Avion implements Vehiculo {
    @Override public String getNombre() { return "Avión"; }
    @Override public double getPrecio() { return 1000000000; }
    @Override public double getVelocidadMaxima() { return 900; }
    @Override public String getCategoria() { return "Base"; }
    @Override public String getEquipamiento() { return "Cabina, Navegación, Motores"; }
}
