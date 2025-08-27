package edu.dosw.lab.creacionales.reto3.Vehiculos.Carros;
import edu.dosw.lab.creacionales.reto3.MedioTransporte;
import edu.dosw.lab.creacionales.reto3.Vehiculo;

public abstract class Carro extends Vehiculo {
    public Carro() {
        super();
        this.precio = 4000.0;
        this.velocidadMax = "150Km";
        this.Descripcion = "";
    }
    @Override
    public  MedioTransporte getMedioTransporte() {
        return MedioTransporte.TIERRA;
    }

}
