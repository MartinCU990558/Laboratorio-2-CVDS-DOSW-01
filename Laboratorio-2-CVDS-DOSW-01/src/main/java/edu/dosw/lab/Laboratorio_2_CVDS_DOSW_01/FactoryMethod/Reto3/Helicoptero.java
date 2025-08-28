
public class Helicoptero implements Vehiculo {
    @Override public String getNombre() { return "Helicóptero"; }
    @Override public double getPrecio() { return 900_000_000; }
    @Override public double getVelocidadMaxima() { return 300; }
    @Override public String getCategoria() { return "Base"; }
    @Override public String getEquipamiento() { return "Rotores, Navegación"; }
}
