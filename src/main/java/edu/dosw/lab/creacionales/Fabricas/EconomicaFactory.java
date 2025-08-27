package edu.dosw.lab.creacionales.Fabricas;

import edu.dosw.lab.creacionales.Vehiculo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas.BicicletaEconimica;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas.BicicletaLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Carros.CarroEconomico;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Carros.CarroLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Motos.MotoEconimica;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Motos.MotoLujo;

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
