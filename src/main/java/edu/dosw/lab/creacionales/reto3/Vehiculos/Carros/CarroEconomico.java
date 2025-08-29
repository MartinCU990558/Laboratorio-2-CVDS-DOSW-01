package edu.dosw.lab.creacionales.reto3.Vehiculos.Carros;


public class CarroEconomico extends Carro {
    public CarroEconomico(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio-(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
