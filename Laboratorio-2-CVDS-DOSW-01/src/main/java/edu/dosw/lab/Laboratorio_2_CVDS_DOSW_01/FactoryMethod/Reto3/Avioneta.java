
public class Avioneta implements Vehiculo {
    @Override public String getNombre() { return "Avioneta"; }
    @Override public double getPrecio() { return 150000000; }
    @Override public double getVelocidadMaxima() { return 250; }
    @Override public String getCategoria() { return "Base"; }
    @Override public String getEquipamiento() { return "Instrumentos básicos de vuelo"; }
}
