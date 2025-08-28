package edu.dosw.lab.creacionales.reto3.Vehiculos.Lancha;

public class LanchaLujo extends Lancha {
    public LanchaLujo(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio+(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
