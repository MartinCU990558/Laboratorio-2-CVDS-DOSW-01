package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Decorador.Reto5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de cafés a personalizar: ");
        int n = Integer.parseInt(sc.nextLine());

        List<Cafe> cafes = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Café " + i + " ---");
            System.out.print("Seleccione toppings (números separados por coma): ");
            String[] seleccion = sc.nextLine().split(",");

            Cafe cafe = new CafeBasico();

            for (String s : seleccion) {
                if (s.isBlank()) continue;
                int opcion = Integer.parseInt(s.trim());

                if (opcion == 1) {
                    cafe = new Decorador(cafe, "Leche", 1000);
                } else if (opcion == 2) {
                    cafe = new Decorador(cafe, "Chocolate", 1500);
                } else if (opcion == 3) {
                    cafe = new Decorador(cafe, "Caramelo", 1200);
                } else if (opcion == 4) {
                    cafe = new Decorador(cafe, "Crema Batida", 2000);
                } else if (opcion == 5) {
                    cafe = new Decorador(cafe, "Menta", 1300);
                } else if (opcion == 6) {
                    System.out.print("Nombre del nuevo topping: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio del nuevo topping: ");
                    double precio = Double.parseDouble(sc.nextLine());
                    cafe = new Decorador(cafe, nombre, precio);
                }
            }
            cafes.add(cafe);
        }

        System.out.println("\n--- RESUMEN DE CAFÉS PERSONALIZADOS ---");
        for (int i = 0; i < cafes.size(); i++) {
            Cafe c = cafes.get(i);
            System.out.println("Café " + (i + 1) + ":");
            System.out.println("Ingredientes: " + c.getDescripcion());
            System.out.println("Precio total: " + c.getPrecio());
            System.out.println();
        }

        double totalGeneral = cafes.stream()
                .collect(Collectors.summingDouble(Cafe::getPrecio));

        System.out.println("Total a pagar por todos los cafés: " + totalGeneral);
        System.out.println("¡Disfrute su café!");
    }
}

