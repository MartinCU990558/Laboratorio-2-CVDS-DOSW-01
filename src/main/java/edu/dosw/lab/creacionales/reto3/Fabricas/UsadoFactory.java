package edu.dosw.lab.creacionales.reto3.Fabricas;

import edu.dosw.lab.creacionales.reto3.Vehiculo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas.BicicletaUsada;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Carros.CarroUsado;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Motos.MotoUsada;

public class UsadoFactory implements VehiculoFactory{
    private double descuento = 0.2;

    public Vehiculo crearCarro() {
        return  new CarroUsado(descuento,"Carro Usado", "120 km/h");
    }

    public Vehiculo crearMoto(){
        return new MotoUsada(descuento,"Moto Usado", "120 km/h");
    }

    public Vehiculo crearBicicleta() {
        return new BicicletaUsada(descuento,"Bicicleta Usada", "20 km/h");
    }
}
