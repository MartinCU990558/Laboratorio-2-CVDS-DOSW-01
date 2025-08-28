package edu.dosw.lab.creacionales.reto3.Vehiculos.Lanchas;

public class LanchaEconomica extends Lancha {
    public LanchaEconomica(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio-(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
