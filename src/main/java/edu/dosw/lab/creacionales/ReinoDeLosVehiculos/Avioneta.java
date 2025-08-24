package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;

public class Avioneta extends Vehiculo {

    public Avioneta(String categoria) {

        this.tipo = TipoVehiculo.AEREO;
        this.modelo = "Avioneta";
        this.categoria = categoria;
        configurar();
    }

    @Override
    public void configurar() {

        if (categoria.equals(Categoria.ECONOMICO)) {
            this.velocidadMax = 250;
            this.precio = 150000000;
            this.equipamiento = "Instrumentos básicos de vuelo";

        } else if (categoria.equals(Categoria.LUJO)) {
            this.velocidadMax = 400;
            this.precio = 500000000;
            this.equipamiento = "Cabina de lujo + GPS";

        } else if (categoria.equals(Categoria.USADO)) {
            this.velocidadMax = 200;
            this.precio = 90000000;
            this.equipamiento = "Cabina estándar";
        }
    }
}
