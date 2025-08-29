package edu.dosw.lab.Creacionales.Reto3;

public class Auto extends Vehiculo {

    public Auto(String categoria, double precio, double velocidadMaxima,
                String equipamiento, String comodidad) {
        super("Tierra", categoria, comodidad, "Auto", equipamiento, precio, velocidadMaxima);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Información del Auto ===");
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











