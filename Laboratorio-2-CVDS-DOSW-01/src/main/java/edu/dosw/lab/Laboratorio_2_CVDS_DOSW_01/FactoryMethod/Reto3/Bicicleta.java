
public class Bicicleta implements Vehiculo {
    @Override
    public String getNombre() {
        return "Bicicleta";
    }

    @Override
    public double getPrecio() {
        return 800000; 
    }

    @Override
    public double getVelocidadMaxima() {
        return 30;
    }

    @Override public String getCategoria() { return "Base"; }


    @Override
    public String getEquipamiento() {
        return "Timbre, Reflectores";
    }
}
