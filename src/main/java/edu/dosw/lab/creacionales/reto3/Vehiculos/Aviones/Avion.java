package edu.dosw.lab.creacionales.reto3.Vehiculos.Aviones;

import edu.dosw.lab.creacionales.MedioTransporte;
import edu.dosw.lab.creacionales.Vehiculo;

import static edu.dosw.lab.creacionales.MedioTransporte.AIRE;

public abstract class Avion extends Vehiculo {
    public Avion() {
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
