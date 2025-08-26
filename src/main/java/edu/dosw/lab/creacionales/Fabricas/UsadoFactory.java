package edu.dosw.lab.creacionales.Fabricas;

import edu.dosw.lab.creacionales.*;
import edu.dosw.lab.creacionales.reto3.Vehiculos.Carros.CarroUsado;

public class UsadoFactory implements VehiculoFactory{
    public Vehiculo crearCarro() {
        return  new CarroUsado();
    }
}
