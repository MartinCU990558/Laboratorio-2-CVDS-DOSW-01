package edu.dosw.lab.creacionales.reto3.Vehiculos.Helicopteros;

public class HelicopteroUsado extends Helicoptero{
    public HelicopteroUsado(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio-(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
