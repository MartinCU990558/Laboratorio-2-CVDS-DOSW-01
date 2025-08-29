package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.FactoryMethod.Reto3;

public class VehiculoLujo extends CategoriaVehiculo {
    public VehiculoLujo(Vehiculo vehiculo) { super(vehiculo); }

    @Override public double getPrecio() { return vehiculo.getPrecio() * 1.20 ; }
    @Override public double getVelocidadMaxima() { return vehiculo.getVelocidadMaxima(); }
    @Override public String getEquipamiento() {
        return vehiculo.getEquipamiento() + " + Extras de lujo ( Algo )";
    }
    @Override public String getCategoria() { return "Lujo"; }       
}
