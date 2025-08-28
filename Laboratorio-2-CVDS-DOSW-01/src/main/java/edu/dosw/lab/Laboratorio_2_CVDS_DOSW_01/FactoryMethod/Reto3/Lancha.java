
public class Lancha implements Vehiculo {
    @Override
    public String getNombre() {
        return "Lancha";
    }

    @Override
    public double getPrecio() {
        return 60000000;
    }

    @Override
    public double getVelocidadMaxima() {
        return 80;
    }

    @Override public String getCategoria() { return "Base"; }


    @Override
    public String getEquipamiento() {
        return "Chalecos salvavidas, Radio";
    }
}
