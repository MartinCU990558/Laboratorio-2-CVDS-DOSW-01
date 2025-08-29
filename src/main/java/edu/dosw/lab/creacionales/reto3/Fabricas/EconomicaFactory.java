package edu.dosw.lab.creacionales.reto3.Fabricas;

import edu.dosw.lab.creacionales.reto3.Vehiculo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas.BicicletaEconimica;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Carros.CarroEconomico;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Lancha.LanchaEconomica;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Lancha.LanchaLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Motos.MotoEconimica;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Aviones.AvionEconomico;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Avionetas.AvionetaEconomica;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Helicopteros.HelicopteroEconomico;
import edu.dosw.lab.creacionales.reto3.Vehiculos.JetSkis.JetSkiEconomica;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Velero.VeleroEconomico;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Velero.VeleroLujo;

public class EconomicaFactory implements VehiculoFactory {
    private double descuento = 0.1;

    @Override
    public Vehiculo crearCarro() {
        return new CarroEconomico(descuento, "Carro Economico", "120 km/h");
    }

    @Override
    public Vehiculo crearMoto() {
        return new MotoEconimica(descuento, "Moto Economico", "120 km/h");
    }

    @Override
    public Vehiculo crearBicicleta() {
        return new BicicletaEconimica(descuento, "Bicicleta Economico", "20 km/h");
    }

    @Override
    public Vehiculo crearAvion() {
        return new AvionEconomico(descuento, "Avión Economico", "800 km/h");
    }

    @Override
    public Vehiculo crearAvioneta() {
        return new AvionetaEconomica(descuento, "Avioneta Economico", "400 km/h");
    }

    @Override
    public Vehiculo crearHelicoptero() {
        return new HelicopteroEconomico(descuento, "Helicóptero Economico", "250 km/h");
    }

    @Override
    public Vehiculo crearJetSki() {
        return new JetSkiEconomica(descuento, "JetSki Economico", "60 km/h");
    }

    @Override
    public Vehiculo crearLancha() {
        return new LanchaEconomica(descuento, "Lancha Economico", "70 km/h");
    }

    @Override
    public Vehiculo crearVelero() {
        return new VeleroEconomico(descuento, "Velero Economico", "40 km/h");
    }
}
