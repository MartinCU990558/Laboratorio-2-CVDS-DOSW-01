package edu.dosw.lab.Creacionales.Reto3;

public class VehiculoFactory {

    public static Vehiculo createVehiculo(String tipo, String catergoria, String equipamiento,String comodidad, double precio, double  velocidadMaxima) {
        switch (tipo.toLowerCase()) {

            case "auto":
                return new Auto(catergoria, precio , velocidadMaxima, equipamiento, comodidad);
            case "moto":
                return new Moto(catergoria, precio, velocidadMaxima, equipamiento, comodidad);
            case "bicicleta":
                return new Bicicleta(catergoria, precio, velocidadMaxima, equipamiento, comodidad);


            case "lancha":
                return new Lancha(catergoria, precio, velocidadMaxima, equipamiento, comodidad);
            case "velero":
                return new Velero(catergoria, precio, velocidadMaxima, equipamiento, comodidad);
            case "jetski":
                return new JetSki(catergoria, precio, velocidadMaxima, equipamiento, comodidad);


            case "avion":
                return new Avion(catergoria, precio, velocidadMaxima, equipamiento, comodidad);
            case "avioneta":
                return new Avioneta(catergoria, precio, velocidadMaxima, equipamiento, comodidad);
            case "helicoptero":
                return new Helicoptero(catergoria, precio, velocidadMaxima, equipamiento, comodidad);

            default:
                System.out.println("Modelo de vehículo no reconocido: " + tipo);
                return null;
        }
    }

    }

