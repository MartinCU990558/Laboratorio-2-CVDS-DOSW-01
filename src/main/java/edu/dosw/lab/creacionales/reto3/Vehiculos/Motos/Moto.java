package edu.dosw.lab.creacionales.reto3.Vehiculos.Motos;

import edu.dosw.lab.creacionales.reto3.MedioTransporte;
import edu.dosw.lab.creacionales.reto3.Vehiculo;

public abstract class Moto extends Vehiculo {
    public Moto() {
        super();
        this.precio = 1500.0;
        this.velocidadMax = "200Km";
        this.Descripcion = "";
    }

    @Override
    public MedioTransporte getMedioTransporte() {
        return MedioTransporte.TIERRA;
    }
}
