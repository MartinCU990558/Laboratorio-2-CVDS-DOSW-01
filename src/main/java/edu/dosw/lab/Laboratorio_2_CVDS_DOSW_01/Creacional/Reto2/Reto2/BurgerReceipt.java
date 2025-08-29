package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Creacional.Reto2;

import java.util.List;

public class BurgerReceipt {
    public static void print(Burger burger) {
        System.out.println("\n--- HAMBURGUESA PERSONALIZADA ---");
        System.out.println("Ingredientes:");
        burger.getIngredients().forEach(System.out::println);
        System.out.println("Precio total: $" + String.format("%,.0f", burger.getPrice()));
        System.out.println("---------------------------------");
        System.out.println("¡Gracias por ordenar con el Chef de 5 Estrellas!");
    }

    public static void printMultiple(List<Burger> burgers) {
        double total = burgers.stream().mapToDouble(Burger::getPrice).sum();
        System.out.println("\n--- RESUMEN DE ORDEN ---");
        int counter = 1;
        for (Burger b : burgers) {
            System.out.println("Hamburguesa " + counter++ + ": $" + String.format("%,.0f", b.getPrice()));
        }
        System.out.println("TOTAL ORDEN: $" + String.format("%,.0f", total));
        System.out.println("------------------------");
    }
}
