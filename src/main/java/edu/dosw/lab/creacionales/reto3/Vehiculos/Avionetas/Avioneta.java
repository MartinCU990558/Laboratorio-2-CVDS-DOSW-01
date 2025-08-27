package edu.dosw.lab.creacionales.reto3.Vehiculos.Avionetas;

import edu.dosw.lab.creacionales.MedioTransporte;
import edu.dosw.lab.creacionales.Vehiculo;

import static edu.dosw.lab.creacionales.MedioTransporte.AIRE;

public abstract class  Avioneta extends Vehiculo {
    public Avioneta() {
        super();
        this.precio = 15000.0;
        this.velocidadMax = "1000Km";
        this.Descripcion = "";
    }

    @Override
    public MedioTransporte getMedioTransporte() {
        return MedioTransporte.AIRE;
    }
}
