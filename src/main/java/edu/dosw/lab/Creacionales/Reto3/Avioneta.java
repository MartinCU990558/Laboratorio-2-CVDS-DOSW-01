package edu.dosw.lab.Creacionales.Reto3;

public class Avioneta extends  Vehiculo{

    public Avioneta(String categoria, double precio, double velocidadMaxima,
                String equipamiento, String comodidad) {

        super("Aereo", categoria, comodidad, "Avioneta", equipamiento, precio, velocidadMaxima);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Información de Avioneta ===");
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
