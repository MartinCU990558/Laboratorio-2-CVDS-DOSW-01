package edu.dosw.lab.creacionales.reto3.Fabricas;

import edu.dosw.lab.creacionales.reto3.Vehiculo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas.BicicletaUsada;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Carros.CarroUsado;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Lancha.LanchaUsada;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Motos.MotoUsada;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Aviones.AvionUsado;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Avionetas.AvionetaUsada;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Helicopteros.HelicopteroUsado;
import edu.dosw.lab.creacionales.reto3.Vehiculos.JetSkis.JetSkiUsada;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Velero.VeleroUsado;

public class UsadoFactory implements VehiculoFactory {
    private double descuento = 0.2;

    @Override
    public Vehiculo crearCarro() {
        return new CarroUsado(descuento, "Carro Usado", "120 km/h");
    }

    @Override
    public Vehiculo crearMoto() {
        return new MotoUsada(descuento, "Moto Usado", "120 km/h");
    }

    @Override
    public Vehiculo crearBicicleta() {
        return new BicicletaUsada(descuento, "Bicicleta Usada", "20 km/h");
    }

    @Override
    public Vehiculo crearAvion() {
        return new AvionUsado(descuento, "Avión Usado", "750 km/h");
    }

    @Override
    public Vehiculo crearAvioneta() {
        return new AvionetaUsada(descuento, "Avioneta Usada", "350 km/h");
    }

    @Override
    public Vehiculo crearHelicoptero() {
        return new HelicopteroUsado(descuento, "Helicóptero Usado", "220 km/h");
    }

    @Override
    public Vehiculo crearJetSki() {
        return new JetSkiUsada(descuento, "JetSki Usado", "55 km/h");
    }
    @Override
    public Vehiculo crearLancha() {
        return new LanchaUsada(descuento, "Lancha Usada", "70 km/h");
    }

    @Override
    public Vehiculo crearVelero() {
        return new VeleroUsado(descuento, "Velero Usado", "40 km/h");
    }

}
