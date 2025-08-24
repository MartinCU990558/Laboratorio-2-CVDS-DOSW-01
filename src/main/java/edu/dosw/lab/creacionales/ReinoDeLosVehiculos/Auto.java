package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;

public class Auto extends Vehiculo {

    public Auto(String categoria) {

        this.tipo = TipoVehiculo.TIERRA;
        this.modelo = "Auto";
        this.categoria = categoria;
        configurar();
    }

    @Override
    public void configurar() {

        if (categoria.equals(Categoria.ECONOMICO)) {
            this.velocidadMax = 120;
            this.precio = 30000000;
            this.equipamiento = "Básico";

        } else if (categoria.equals(Categoria.LUJO)) {
            this.velocidadMax = 180;
            this.precio = 50000000;
            this.equipamiento = "Aire acondicionado + GPS";

        } else if (categoria.equals(Categoria.USADO)) {
            this.velocidadMax = 100;
            this.precio = 15000000;
            this.equipamiento = "Equipamiento estándar";
        }
    }
}
