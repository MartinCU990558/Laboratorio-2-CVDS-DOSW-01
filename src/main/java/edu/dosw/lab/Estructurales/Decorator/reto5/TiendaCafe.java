package edu.dosw.lab.Estructurales.Decorator.reto5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TiendaCafe {
    private static HashMap<String, Integer> listaToppings = ToppingsCafe.obtenerToppings();
    private static ArrayList<Cafe> cafesitos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("---Bienvenido a la tienda de Cafes---");
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos cafes desea personalizar? ");
        int cafes = sc.nextInt();
        sc.nextLine();
        System.out.println(mostrarToppings());

        for (int i = 1; i <= cafes; i++) {
            System.out.println("--- Cafe " + i + " ---");
            cafesitos.add(procesarCafe());
        }

        System.out.println("\n---Resumen del pedido---");
        int contador = 1;
        for (Cafe cafe : cafesitos) {
            System.out.println("Café " + contador++);
            System.out.println("Ingredientes: " + cafe.getDescripcion());
            System.out.println("Precio Total: " + cafe.getPrecio() + "\n");
        }
        System.out.println("-------------------");
        int totalCafes = cafesitos.stream().mapToInt(Cafe::getPrecio).sum();
        System.out.println("Total a pagar por todos los cafes: " + totalCafes);
        System.out.println("¡Disfrute su café!");
    }

    public static String mostrarToppings() {
        StringBuilder sb = new StringBuilder();
        sb.append("Puedes escoger los siguientes toppings: \n");
        int contador = 1;
        for (String top : listaToppings.keySet()) {
            sb.append(contador).append(". ").append(top)
                    .append(" ($").append(listaToppings.get(top)).append(")\n");
            contador++;
        }
        sb.append(contador).append(". Añade un nuevo ingrediente\n");
        return sb.toString();
    }

    public static Cafe procesarCafe() {
        Scanner sc = new Scanner(System.in);
        Cafe cafe = new CafeBase();

        System.out.print("Escoge los toppings (Ej: 1,2): ");
        String[] opciones = sc.nextLine().split(",");

        for (String opcion : opciones) {
            int seleccion = Integer.parseInt(opcion);
            if (seleccion <= listaToppings.size()) {
                ArrayList<String> claves = new ArrayList<>(listaToppings.keySet());
                String topping = claves.get(seleccion - 1);
                int precioTopping = listaToppings.get(topping);
                cafe = new ToppingDecorator(cafe, topping, precioTopping);
            } else {
                Topping nuevo = añadirNuevoTopping();
                listaToppings.put(nuevo.getName(), nuevo.getPrice());
                cafe = new ToppingDecorator(cafe, nuevo.getName(), nuevo.getPrice());
            }
        }
        return cafe;
    }

    public static Topping añadirNuevoTopping() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nuevo topping: ");
        String nuevoTop = scanner.nextLine();
        System.out.print("Ingrese el valor del ingrediente: ");
        int precioTop = scanner.nextInt();
        scanner.nextLine();
        return new Topping(nuevoTop, precioTop);
    }
}

