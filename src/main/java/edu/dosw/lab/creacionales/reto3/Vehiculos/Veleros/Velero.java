package edu.dosw.lab.creacionales.reto3.Vehiculos.Veleros;

import edu.dosw.lab.creacionales.reto3.MedioTransporte;
import edu.dosw.lab.creacionales.reto3.Vehiculo;

public abstract class Velero extends Vehiculo {
    public Velero() {
        super();
        this.precio = 120000.0;
        this.velocidadMax = "1000Km";
        this.Descripcion = "";
    }

    @Override
    public MedioTransporte getMedioTransporte() {
        return MedioTransporte.AGUA;
    }
}
