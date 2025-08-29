package edu.dosw.lab.creacionales.reto3.Vehiculos.Aviones;

public class AvionUsado extends Avion {
    public AvionUsado(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio-(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
