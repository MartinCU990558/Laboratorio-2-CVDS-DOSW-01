package edu.dosw.lab.creacionales.reto3.Vehiculos.JetSkis;

import edu.dosw.lab.creacionales.reto3.MedioTransporte;
import edu.dosw.lab.creacionales.reto3.Vehiculo;

public class JetSki extends Vehiculo {
    public JetSki() {
        super();
        this.precio = 15000.0;
        this.velocidadMax = "1000Km";
        this.Descripcion = "";
    }

    @Override
    public MedioTransporte getMedioTransporte() {
        return MedioTransporte.AGUA;
    }
}
