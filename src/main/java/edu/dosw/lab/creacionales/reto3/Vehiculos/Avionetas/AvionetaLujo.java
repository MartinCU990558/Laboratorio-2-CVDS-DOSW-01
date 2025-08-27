package edu.dosw.lab.creacionales.reto3.Vehiculos.Avionetas;

public class AvionetaLujo extends Avioneta{
    public AvionetaLujo(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio+(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
