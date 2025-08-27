package edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas;

import edu.dosw.lab.creacionales.reto3.MedioTransporte;
import edu.dosw.lab.creacionales.reto3.Vehiculo;

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
