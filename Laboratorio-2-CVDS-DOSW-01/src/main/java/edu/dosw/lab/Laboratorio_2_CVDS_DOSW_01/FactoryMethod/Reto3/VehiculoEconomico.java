package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.FactoryMethod.Reto3;

public class VehiculoEconomico extends CategoriaVehiculo {
    public VehiculoEconomico(Vehiculo vehiculo) { super(vehiculo); }

    @Override public double getPrecio() { return vehiculo.getPrecio() * 0.90 ; }
    @Override public double getVelocidadMaxima() {
        return  vehiculo.getVelocidadMaxima();
    }
    @Override public String getEquipamiento() {
        return vehiculo.getEquipamiento() + " + Equipamiento estándar reducido";
    }
    @Override public String getCategoria() { return "Económico"; } 
}
