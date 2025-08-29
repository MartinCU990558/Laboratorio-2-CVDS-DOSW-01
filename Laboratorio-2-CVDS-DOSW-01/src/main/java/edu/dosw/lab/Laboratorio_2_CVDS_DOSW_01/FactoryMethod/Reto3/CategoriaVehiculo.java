package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.FactoryMethod.Reto3;


public abstract class CategoriaVehiculo implements Vehiculo {
    protected final Vehiculo vehiculo;

    protected CategoriaVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public Vehiculo getVehiculoBase() {
        return vehiculo;
    }

    @Override public String getNombre() { return vehiculo.getNombre(); }
    @Override public String getEquipamiento() { return vehiculo.getEquipamiento(); }
}
