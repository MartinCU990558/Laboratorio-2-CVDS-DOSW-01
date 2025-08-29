package edu.dosw.lab.creacionales.reto3.Vehiculos.Lancha;

import edu.dosw.lab.creacionales.reto3.MedioTransporte;
import edu.dosw.lab.creacionales.reto3.Vehiculo;

public abstract class Lancha extends Vehiculo {
    public Lancha() {
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
