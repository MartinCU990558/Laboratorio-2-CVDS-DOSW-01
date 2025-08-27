package edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas;

import edu.dosw.lab.creacionales.MedioTransporte;
import edu.dosw.lab.creacionales.Vehiculo;

import static edu.dosw.lab.creacionales.MedioTransporte.*;

public abstract class Bicicleta extends Vehiculo {
    public Bicicleta() {
        this.precio = 100.0;
        this.velocidadMax = "30Km";
        this.Descripcion = "";
    }

    @Override
    public MedioTransporte getMedioTransporte() {
        return MedioTransporte.TIERRA;
    }

}
