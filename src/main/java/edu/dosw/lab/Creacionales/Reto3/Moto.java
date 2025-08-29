package edu.dosw.lab.Creacionales.Reto3;

public class Moto extends Vehiculo {

    public Moto(String categoria, double precio, double velocidadMaxima,
                String equipamiento, String comodidad) {

        super("Tierra", categoria, comodidad, "Moto", equipamiento, precio, velocidadMaxima);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Información de Moto ===");
        System.out.println("Tipo: " + tipo);
        System.out.println("Categoría: " + catergoria);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Precio: $" + precio);
        System.out.println("Comodidad: " + comodidad);
        System.out.println("Equipamiento: " + equipamiento);
        System.out.println("=============================\n");
    }
}

