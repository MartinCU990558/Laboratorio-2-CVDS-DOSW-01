package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Estructural.Reto5;

import java.util.List;

public class CoffeeReceipt {
    public static void print(List<Coffee> coffees) {
        System.out.println("\n--- RESUMEN DE CAFÉS ---");
        int counter = 1;
        double total = 0;

        for (Coffee c : coffees) {
            System.out.println("Café " + counter++ + ": " + c.getDescription()
                    + " - $" + String.format("%,.0f", c.getPrice()));
            total += c.getPrice();
        }
        System.out.println("TOTAL: $" + String.format("%,.0f", total));
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra en la Cafetería Creativa!");
    }
}
