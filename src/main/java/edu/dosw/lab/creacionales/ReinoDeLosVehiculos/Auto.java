package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;

public class Auto extends Vehiculo {

    public Auto(String categoria) {
        super(TipoVehiculo.TIERRA, categoria, "Auto");
        configurar();
    }

    @Override
    public void configurar() {

        if (categoria.equals(Categoria.ECONOMICO)) {
            setVelocidadMax(120);
            setPrecio(30000000);
            setEquipamiento("Básico");

        } else if (categoria.equals(Categoria.LUJO)) {
            setVelocidadMax(180);
            setPrecio(50000000);
            setEquipamiento("Aire acondicionado + GPS");

        } else if (categoria.equals(Categoria.USADO)) {
            setVelocidadMax(100);
            setPrecio(15000000);
            setEquipamiento("Equipamiento estándar");
        }
    }
}
