package edu.dosw.lab.creacionales.reto3.Vehiculos.Lanchas;

import edu.dosw.lab.creacionales.reto3.MedioTransporte;
import edu.dosw.lab.creacionales.reto3.Vehiculo;

public abstract class Lancha  extends Vehiculo {
    public Lancha() {
        super();
        this.precio = 12000.0;
        this.velocidadMax = "1000Km";
        this.Descripcion = "";
    }

    @Override
    public MedioTransporte getMedioTransporte() {
        return MedioTransporte.AGUA;
    }
}
