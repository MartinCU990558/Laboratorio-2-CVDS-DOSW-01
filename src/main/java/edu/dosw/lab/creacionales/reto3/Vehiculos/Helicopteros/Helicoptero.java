package edu.dosw.lab.creacionales.reto3.Vehiculos.Helicopteros;

import edu.dosw.lab.creacionales.reto3.MedioTransporte;
import edu.dosw.lab.creacionales.reto3.Vehiculo;

public class Helicoptero extends Vehiculo {
    public Helicoptero() {
        super();
        this.precio = 150000.0;
        this.velocidadMax = "1000Km";
        this.Descripcion = "";
    }

    @Override
    public MedioTransporte getMedioTransporte() {
        return MedioTransporte.AIRE;
    }
}
