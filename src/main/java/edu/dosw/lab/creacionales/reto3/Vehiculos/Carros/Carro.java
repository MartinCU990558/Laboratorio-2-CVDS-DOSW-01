package edu.dosw.lab.creacionales.reto3.Vehiculos.Carros;
import edu.dosw.lab.creacionales.MedioTransporte;
import edu.dosw.lab.creacionales.Vehiculo;

import static edu.dosw.lab.creacionales.MedioTransporte.TIERRA;

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
