package edu.dosw.lab.creacionales.reto3.Vehiculos.Aviones;

public class AvionLujo extends Avion {
    public AvionLujo(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio+(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
