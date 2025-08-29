package edu.dosw.lab.creacionales.reto3.Vehiculos.JetSkis;

public class JetSkiEconomica extends JetSki {
    public JetSkiEconomica(Double Descuento, String Descripcion, String VelocidadMax) {
        super();
        this.precio = this.precio+(this.precio*Descuento);
        this.Descripcion = Descripcion;
        this.velocidadMax = velocidadMax;
    }
}
