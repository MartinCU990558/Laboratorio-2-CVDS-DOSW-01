package edu.dosw.lab.creacionales.reto3.Vehiculos.Motos;

import edu.dosw.lab.creacionales.MedioTransporte;
import edu.dosw.lab.creacionales.Vehiculo;

import static edu.dosw.lab.creacionales.MedioTransporte.TIERRA;

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
