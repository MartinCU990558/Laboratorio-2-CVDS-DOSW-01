package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.FactoryMethod.Reto3;

public class JetSki implements Vehiculo {
    @Override public String getNombre() { return "Jet Ski"; }
    @Override public double getPrecio() { return 45_000_000; }
    @Override public double getVelocidadMaxima() { return 90; }
    @Override public String getCategoria() { return "Base"; }
    @Override public String getEquipamiento() { return "Motor fuera de borda, Amarras"; }
}
