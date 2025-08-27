package edu.dosw.lab.creacionales.reto3.Vehiculos.Motos;

public class MotoLujo extends Moto {
    public MotoLujo(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio-(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
