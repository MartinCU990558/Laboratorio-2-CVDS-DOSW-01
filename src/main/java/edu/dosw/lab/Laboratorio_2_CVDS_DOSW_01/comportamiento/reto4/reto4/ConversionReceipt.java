package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto4;

import java.util.List;

public class ConversionReceipt {
    public static void print(List<String> conversions, double total) {
        System.out.println("\n--- RESUMEN DE TRANSACCIONES ---");
        conversions.forEach(System.out::println);
        System.out.println("Total convertido: $" + String.format("%,.2f", total));
        System.out.println("--------------------------------");
        System.out.println("¡Gracias por usar la Casa de Cambio!");
    }
}
