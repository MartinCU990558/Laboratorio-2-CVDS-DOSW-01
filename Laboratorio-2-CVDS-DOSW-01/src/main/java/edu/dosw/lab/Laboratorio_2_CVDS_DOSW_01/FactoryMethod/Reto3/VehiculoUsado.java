

public class VehiculoUsado extends CategoriaVehiculo {
    public VehiculoUsado(Vehiculo vehiculo) { super(vehiculo); }

    @Override public double getPrecio() { return vehiculo.getPrecio()* 0.80; }
    @Override public double getVelocidadMaxima() {
        return Math.max(0, vehiculo.getVelocidadMaxima() -5 );
    }
    @Override public String getEquipamiento() {
        return vehiculo.getEquipamiento() + " + Revisión mecánica y garantía limitada";
    }
    @Override public String getCategoria() { return "Usado"; }     
}
