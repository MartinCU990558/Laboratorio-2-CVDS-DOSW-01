package edu.dosw.lab.creacionales.reto3.Vehiculos.Motos;

import edu.dosw.lab.creacionales.Vehiculo;

public class MotoUsada extends Moto{
    public MotoUsada(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio-(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
