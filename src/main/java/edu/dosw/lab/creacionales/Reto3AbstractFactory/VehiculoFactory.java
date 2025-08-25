package edu.dosw.lab.creacionales.Reto3AbstractFactory;

import java.util.Locale;

public class VehiculoFactory {
    public static Vehiculo crearVehiculo(String tipo, Categoria categoria){
        switch(tipo.toLowerCase()){
            case "auto":
                return new Auto(categoria);
            case "avion":
                return new Avion(categoria);
            case "avioneta":
                return new Avioneta(categoria);
            case "bicicleta":
                return new Bicicleta(categoria);
            case "jet ski":
                return new JetSki(categoria);
            case "helicoptero":
                return new Helicoptero(categoria);
            case "lancha":
                return new Lancha(categoria);
            case "moto":
                return new Moto(categoria);
            case "velero":
                return new Velero(categoria);
            default:
                throw new IllegalArgumentException("Tipo de vehiculo no valido : " + tipo);
        }
    }
}
