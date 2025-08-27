package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;

public class Lancha extends Vehiculo {
    public Lancha(String categoria) {
        super(TipoVehiculo.ACUATICO, categoria, "Lancha");
        configurar();
    }

    @Override
    public void configurar() {
        if (categoria.equals(Categoria.ECONOMICO)) {
            setVelocidadMax(80);
            setPrecio(200000000);
            setEquipamiento("Motor básico y asientos simples");
        } else if (categoria.equals(Categoria.LUJO)) {
            setVelocidadMax(150);
            setPrecio(800000000);
            setEquipamiento("Motor potente, asientos de cuero y sistema de sonido premium");
        } else if (categoria.equals(Categoria.USADO)) {
            setVelocidadMax(60);
            setPrecio(100000000);
            setEquipamiento("Motor estándar y asientos normales");
        }
    }
}
