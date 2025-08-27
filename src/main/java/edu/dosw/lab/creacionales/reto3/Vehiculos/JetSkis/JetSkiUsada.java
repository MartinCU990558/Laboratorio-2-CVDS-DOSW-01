package edu.dosw.lab.creacionales.reto3.Vehiculos.JetSkis;

public class JetSkiUsada extends JetSki {
    public JetSkiUsada(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio+(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
