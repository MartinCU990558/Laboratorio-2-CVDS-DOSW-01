package edu.dosw.lab.creacionales.Fabricas;

import edu.dosw.lab.creacionales.Vehiculo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas.BicicletaLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Bicicletas.BicicletaUsada;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Carros.CarroLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Carros.CarroUsado;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Motos.MotoLujo;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Motos.MotoUsada;

public class LujoFactory implements VehiculoFactory{
    private double descuento = 0.5;

    public Vehiculo crearCarro() {
        return  new CarroLujo(descuento,"Carro Usado", "120 km/h");
    }

    public Vehiculo crearMoto(){
        return new MotoLujo(descuento,"Moto Usado", "120 km/h");
    }

    public Vehiculo crearBicicleta() {
        return new BicicletaLujo(descuento,"Bicicleta Usada", "20 km/h");
    }
}
