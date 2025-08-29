package edu.dosw.lab.creacionales.reto3.Fabricas;

import edu.dosw.lab.creacionales.reto3.Vehiculo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas.BicicletaLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Carros.CarroLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Lancha.LanchaLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Motos.MotoLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Aviones.AvionLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Avionetas.AvionetaLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Helicopteros.HelicopteroLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.JetSkis.JetSkiLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Velero.VeleroLujo;

public class LujoFactory implements VehiculoFactory {
    private double descuento = 0.5;

    @Override
    public Vehiculo crearCarro() {
        return new CarroLujo(descuento, "Carro Lujo", "120 km/h");
    }

    @Override
    public Vehiculo crearMoto() {
        return new MotoLujo(descuento, "Moto Lujo", "120 km/h");
    }

    @Override
    public Vehiculo crearBicicleta() {
        return new BicicletaLujo(descuento, "Bicicleta Lujo", "20 km/h");
    }

    @Override
    public Vehiculo crearAvion() {
        return new AvionLujo(descuento, "Avión Lujo", "900 km/h");
    }

    @Override
    public Vehiculo crearAvioneta() {
        return new AvionetaLujo(descuento, "Avioneta Lujo", "500 km/h");
    }

    @Override
    public Vehiculo crearHelicoptero() {
        return new HelicopteroLujo(descuento, "Helicóptero Lujo", "300 km/h");
    }

    @Override
    public Vehiculo crearJetSki() {
        return new JetSkiLujo(descuento, "JetSki Lujo", "80 km/h");
    }
    @Override
    public Vehiculo crearLancha() {
        return new LanchaLujo(descuento, "Lancha Lujo", "70 km/h");
    }

    @Override
    public Vehiculo crearVelero() {
        return new VeleroLujo(descuento, "Velero Lujo", "40 km/h");
    }

}
