package edu.dosw.lab.creacionales.reto3.Vehiculos.Helicopteros;

public class HelicopteroLujo extends Helicoptero{
    public HelicopteroLujo(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio+(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
