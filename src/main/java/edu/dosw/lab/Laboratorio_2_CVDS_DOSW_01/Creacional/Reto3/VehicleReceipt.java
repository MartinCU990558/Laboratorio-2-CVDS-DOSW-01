package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Creacional.Reto3;

import java.util.List;

public class VehicleReceipt {
    public static void print(List<Vehicle> vehicles) {
        System.out.println("---- RESUMEN DE COMPRA ---");
        double subtotal = 0;
        int counter = 1;

        for (Vehicle v : vehicles) {
            System.out.println("\nVehículo " + counter++ + ":");
            System.out.println("Tipo: " + v.getType());
            System.out.println("Categoría: " + v.getCategory());
            System.out.println("Velocidad máxima: " + v.getMaxSpeed() + " km/h");
            System.out.println("Precio: $" + String.format("%,.0f", v.getPrice()));
            System.out.println("Equipamiento: " + v.getEquipment());
            subtotal += v.getPrice();
        }
        System.out.println("\nSubtotal: $" + String.format("%,.0f", subtotal));
        System.out.println("Descuento aplicado: $0");
        System.out.println("Total a pagar: $" + String.format("%,.0f", subtotal));
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra en el Reino de los Vehículos!");
    }
}

