package edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas;

import edu.dosw.lab.creacionales.Vehiculo;

public class BicicletaUsada extends Bicicleta {

    public BicicletaUsada(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio-(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }


}
