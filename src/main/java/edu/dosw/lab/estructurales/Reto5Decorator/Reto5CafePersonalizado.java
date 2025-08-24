package edu.dosw.lab.estructurales.Reto5Decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reto5CafePersonalizado {
    public static void ejecutar() {
        ArrayList<Topping> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numeros de cafes a personalizar: ");
        int numeroDeCafes = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numeroDeCafes; i++) {
            Topping cafeInicial = new Cafe();
            System.out.println("-- Cafe " + (i + 1) + "---");
            System.out.println("Seleccione toppings (numeros separados por coma): ");
            String toppings = scanner.nextLine();
            List<Integer> ingreso = Arrays.stream(toppings.split(","))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            cafeInicial = construccionCafe(ingreso, scanner);
            lista.add(cafeInicial);
        }
        System.out.println("--- RESUMEN DE CAFE PERSONALIZADO ---");

        for (int i = 0; i < numeroDeCafes; i++) {
            System.out.println("Cafe " + (i + 1) + ":");
            System.out.println("Ingredientes: " + lista.get(i).getNombre());
            System.out.println("Precio total: $" + lista.get(i).getPrecio());

        }
        System.out.println("-----------------------------");
        double total = lista.stream().mapToDouble(Topping::getPrecio).sum();
        System.out.println("Total a pagar por todos los cafes: " + total);
        System.out.println("Disfrute su cafe!");
    }

    public static Topping construccionCafe(List<Integer> ingreso, Scanner scanner) {
        Topping cafe = new Cafe();
        for (Integer opcion : ingreso) {
            switch (opcion) {
                case 1:
                    cafe = new Leche(cafe);
                    break;
                case 2:
                    cafe = new Chocolate(cafe);
                    break;
                case 3:
                    cafe = new Caramelo(cafe);
                    break;
                case 4:
                    cafe = new CremaBatida(cafe);
                    break;
                case 5:
                    cafe = new Menta(cafe);
                    break;
                case 6:
                    System.out.println("Ingreso nombre del nuevo topping: ");
                    String nuevo = scanner.nextLine();
                    System.out.println("Ingrese precio del topping: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();
                    cafe = new NuevoTopping(cafe, precio, nuevo);
                    break;
                default:
                    break;
            }

        }
        return cafe;
    }
}
