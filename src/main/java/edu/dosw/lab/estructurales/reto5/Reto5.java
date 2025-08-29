package edu.dosw.lab.estructurales.reto5;

import java.util.*;

public class Reto5 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        List<Cafe> cafes = new ArrayList<>();

        System.out.print("Número de cafés a personalizar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Café " + i + " ---");
            System.out.println("Opciones de toppings:");
            System.out.println("1. Leche ($1000)\n2. Chocolate ($1500)\n3. Caramelo ($1200)\n4. Crema Batida ($2000)\n5. Menta ($1300)\n6. Agregar nuevo topping");

            System.out.print("Seleccione toppings (números separados por coma): ");
            String[] opciones = sc.nextLine().split(",");

            Cafe cafe = new CafeBase();

            for (String op : opciones) {
                switch (op.trim()) {
                    case "1": cafe = new Topping.Leche(cafe); break;
                    case "2": cafe = new Topping.Chocolate(cafe); break;
                    case "3": cafe = new Topping.Caramelo(cafe); break;
                    case "4": cafe = new Topping.CremaBatida(cafe); break;
                    case "5": cafe = new Topping.Menta(cafe); break;
                    case "6":
                        System.out.print("Ingrese nombre del nuevo topping: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese precio del topping: ");
                        int precio = sc.nextInt();
                        sc.nextLine();
                        cafe = new CustomTopping(cafe, nombre, precio);
                        break;
                }
            }
            cafes.add(cafe);
        }

        System.out.println("\n--- RESUMEN DE CAFÉ PERSONALIZADO ---\n");
        int index = 1;

        for (Cafe cafe : cafes) {
            System.out.println("Café " + index++ + ":");
            System.out.println("Ingredientes: " + cafe.getDescripcion());
            System.out.println("Precio total: $" + cafe.getPrecio());
            System.out.println();
        }

        int total = cafes.stream().mapToInt(Cafe::getPrecio).sum();
        System.out.println("-----------------------------------");
        System.out.println("Total a pagar por todos los cafés: $" + total);
        System.out.println("¡Disfrute su café!");
    }
}