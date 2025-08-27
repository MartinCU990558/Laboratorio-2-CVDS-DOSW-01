package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;

public class Bicicleta extends Vehiculo {

    public Bicicleta(String categoria) {
        super(TipoVehiculo.TIERRA, categoria, "Bicicleta");
        configurar();
    }
    @Override
    public void configurar() {

        if (categoria.equals(Categoria.ECONOMICO)) {
            setVelocidadMax(25);
            setPrecio(300000);
            setEquipamiento("Marco en asero forjaco con accesorios básicos");

        } else if (categoria.equals(Categoria.LUJO)) {
            setVelocidadMax(40);
            setPrecio(5000000);
            setEquipamiento("Marco en carbono con accesorios de lujo shimano");

        } else if (categoria.equals(Categoria.USADO)) {
            setVelocidadMax(32);
            setPrecio(800000);
            setEquipamiento("Equipamiento estándar con accesorios usados de la marca GW");
        }
    }

}


