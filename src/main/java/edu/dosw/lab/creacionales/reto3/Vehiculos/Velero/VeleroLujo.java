package edu.dosw.lab.creacionales.reto3.Vehiculos.Velero;

import edu.dosw.lab.creacionales.reto3.Vehiculo;

public class VeleroLujo extends Velero {
    public VeleroLujo(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio+(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
