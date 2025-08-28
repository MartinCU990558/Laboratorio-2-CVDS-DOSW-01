
public class Velero implements Vehiculo {
    @Override public String getNombre() { return "Velero"; }
    @Override public double getPrecio() { return 120_000_000; }
    @Override public double getVelocidadMaxima() { return 40; }
    @Override public String getCategoria() { return "Base"; }  // categoría por defecto
    @Override public String getEquipamiento() { return "Vela mayor, Cabina"; }
}
