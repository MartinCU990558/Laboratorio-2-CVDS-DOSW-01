package edu.dosw.lab.Estructurales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToppingFactory factory = new ToppingFactory();

        System.out.print("Número de cafés a personalizar: ");
        int n = sc.nextInt(); sc.nextLine();

        List<Coffee>  coffees = new ArrayList<>();
        int total = 0;

        for (int i = 0; i < n; i++) {
            Coffee coffee = new Base();
            System.out.println("\n--- Café " + (i+1) + " ---");

            factory.mostrarCatalogo();
            System.out.print("Seleccione toppings (números separados por coma): ");
            String input = sc.nextLine();
            String[] indices = input.split(",");
            for (String idx : indices) {
                int opcion = Integer.parseInt(idx.trim());
                coffee = factory.crearTopping(coffee, opcion, sc);
            }
            coffees.add(coffee);
        }
        System.out.println("\n--- RESUMEN DE CAFÉ PERSONALIZADO ---");
        for (int i = 0; i < coffees.size(); i++) {
            Coffee coffee = coffees.get(i);
            System.out.println("\nCafé " + (i+1) + ":");
            System.out.println("Ingredientes: " + coffee.description());
            System.out.println("Precio total: $" + coffee.cost());
            total += coffee.cost();

        }
        System.out.println("\n--------------------------------------");
        System.out.println("\nTotal a pagar por todos los cafés: $" + total);
        System.out.println("¡Disfrute su café!");
    }
}
