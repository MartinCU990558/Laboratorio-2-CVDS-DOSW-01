package edu.dosw.lab.creacionales.reto3.Fabricas;

import edu.dosw.lab.creacionales.reto3.Vehiculo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas.BicicletaEconimica;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Carros.CarroEconomico;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Motos.MotoEconimica;

public class EconomicaFactory implements VehiculoFactory{
    private double descuento = 0.1;

    public Vehiculo crearCarro() {
        return  new CarroEconomico(descuento,"Carro Usado", "120 km/h");
    }

    public Vehiculo crearMoto(){
        return new MotoEconimica(descuento,"Moto Usado", "120 km/h");
    }

    public Vehiculo crearBicicleta() {
        return new BicicletaEconimica(descuento,"Bicicleta Usada", "20 km/h");
    }
}
