package edu.dosw.lab.creacionales.reto3.Vehiculos.Velero;

import edu.dosw.lab.creacionales.reto3.MedioTransporte;
import edu.dosw.lab.creacionales.reto3.Vehiculo;

public class Velero extends Vehiculo {
    public Velero() {
        super();
        this.precio = 1500.0;
        this.velocidadMax = "200Km";
        this.Descripcion = "";
    }

    @Override
    public MedioTransporte getMedioTransporte() {
        return MedioTransporte.AGUA;
    }
}
