package edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas;

public class BicicletaEconimica extends Bicicleta {
    public BicicletaEconimica(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio-(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
