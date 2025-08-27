package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;

public class Avioneta extends Vehiculo {

    public Avioneta(String categoria) {
        super(TipoVehiculo.AEREO, categoria, "Avioneta");
        configurar();
    }

    @Override
    public void configurar() {

        if (categoria.equals(Categoria.ECONOMICO)) {
            setVelocidadMax(250);
            setPrecio(150000000);
            setEquipamiento("Instrumentos básicos de vuelo");

        } else if (categoria.equals(Categoria.LUJO)) {
            setVelocidadMax(400);
            setPrecio(500000000);
            setEquipamiento("Cabina de lujo + GPS");

        } else if (categoria.equals(Categoria.USADO)) {
            setVelocidadMax(200);
            setPrecio(90000000);
            setEquipamiento("Cabina estándar");
        }
    }
}
