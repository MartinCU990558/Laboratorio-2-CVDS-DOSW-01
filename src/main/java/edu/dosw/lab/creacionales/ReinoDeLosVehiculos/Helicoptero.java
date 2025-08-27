package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;

public class Helicoptero extends Vehiculo {
    public Helicoptero(String categoria) {
        super(TipoVehiculo.AEREO, categoria, "Helicoptero");
        configurar();
    }

    @Override
    public void configurar() {
        if (categoria.equals(Categoria.ECONOMICO)) {
            setVelocidadMax(200);
            setPrecio(180000000);
            setEquipamiento("Instrumentos básicos de vuelo + Asientos estándar");

        } else if (categoria.equals(Categoria.LUJO)) {
            setVelocidadMax(350);
            setPrecio(860000000);
            setEquipamiento("Cabina de lujo + GPS + Asientos de cuero");

        } else if (categoria.equals(Categoria.USADO)) {
            setVelocidadMax(180);
            setPrecio(120000000);
            setEquipamiento("Cabina estándar + Asientos estándar");
        }
    }
}
