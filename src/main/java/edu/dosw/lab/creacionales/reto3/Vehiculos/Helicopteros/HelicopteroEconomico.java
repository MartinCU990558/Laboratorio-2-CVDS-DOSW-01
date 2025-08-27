package edu.dosw.lab.creacionales.reto3.Vehiculos.Helicopteros;

public class HelicopteroEconomico extends Helicoptero{
    public HelicopteroEconomico(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio-(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
