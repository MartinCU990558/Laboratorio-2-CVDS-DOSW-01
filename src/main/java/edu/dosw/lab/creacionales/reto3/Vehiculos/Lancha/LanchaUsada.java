package edu.dosw.lab.creacionales.reto3.Vehiculos.Lancha;

public class LanchaUsada extends Lancha {
    public LanchaUsada(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio-(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
