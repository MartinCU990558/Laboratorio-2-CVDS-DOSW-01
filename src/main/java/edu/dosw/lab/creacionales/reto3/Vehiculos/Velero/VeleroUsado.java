package edu.dosw.lab.creacionales.reto3.Vehiculos.Velero;

public class VeleroUsado extends Velero {
    public VeleroUsado(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio-(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
