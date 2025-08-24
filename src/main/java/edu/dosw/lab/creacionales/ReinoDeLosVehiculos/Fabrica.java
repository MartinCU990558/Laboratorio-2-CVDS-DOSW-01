package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;

public class Fabrica {

    public static Vehiculo crearVehiculo(String modelo, String categoria) {
        switch (modelo.toLowerCase()) {
            case "auto": return new Auto(categoria);
            case "avioneta": return new Avioneta(categoria);
            // se pueden agregar más: moto, bicicleta, lancha, etc.
            default: throw new IllegalArgumentException("Modelo no soportado: " + modelo);
        }
    }

}
