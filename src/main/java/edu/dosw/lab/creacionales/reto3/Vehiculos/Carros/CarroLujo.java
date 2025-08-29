package edu.dosw.lab.creacionales.reto3.Vehiculos.Carros;

public class CarroLujo extends Carro  {
    public CarroLujo(Double Descuento, String Descripcion, String VelocidadMax){
        super();
        this.precio = this.precio-(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
