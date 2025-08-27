package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;

public class Moto extends Vehiculo {
    public Moto(String categoria) {
        super(TipoVehiculo.TIERRA, categoria, "Moto");
        configurar();
    }
    @Override
    public void configurar() {

        if (categoria.equals(Categoria.ECONOMICO)) {
            setVelocidadMax(80);
            setPrecio(8000000);
            setEquipamiento("Moto con equipamiento básico, sin accesorios");

        } else if (categoria.equals(Categoria.LUJO)) {
            setVelocidadMax(280);
            setPrecio(150000000);
            setEquipamiento("Moto con equipamiento de lujo, con accesorios en fibra de carbono y GPS");

        } else if (categoria.equals(Categoria.USADO)) {
            setVelocidadMax(125);
            setPrecio(12000000);
            setEquipamiento("Moto con equipamiento estándar, con accesorios usados de la marca Yamaha");
        }
    }
}
