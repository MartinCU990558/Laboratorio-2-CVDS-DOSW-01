package edu.dosw.lab.estructurales.reto5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadCafes = leerEntero(sc, "Número de cafés a personalizar: ", 1, 100);

        List<Topping> pedidos = new ArrayList<>();

        for (int i = 1; i <= cantidadCafes; i++) {
            System.out.println("\n--- Café " + i + " ---");
            Topping cafe = new Cafe(); 

            boolean seguir = true;
            while (seguir) {
                System.out.println("\nSeleccione topping:");
                System.out.println("1. Leche (+1000)");
                System.out.println("2. Chocolate (+1500)");
                System.out.println("3. Crema Batida (+2000)");
                System.out.println("4. Menta (+1300)");
                System.out.println("5. Caramelo (+1200)");
                System.out.println("6. Añadir ingrediente personalizado");
                System.out.println("0. Terminar selección");

                int opcion = leerEntero(sc, "Opción: ", 0, 6);

                switch (opcion) {
                    case 1 -> cafe = new Leche(cafe);
                    case 2 -> cafe = new Chocolate(cafe);
                    case 3 -> cafe = new CremaBatida(cafe);
                    case 4 -> cafe = new Menta(cafe);
                    case 5 -> cafe = new Caramelo(cafe);
                    case 6 -> {
                        String nombreNuevo = leerTextoNoVacio(sc, "Nombre del nuevo ingrediente: ");
                        int precioNuevo = leerEntero(sc, "Precio extra (entero): ", 0, 1000000);
                        cafe = new IngredientePersonalizado(cafe, nombreNuevo, precioNuevo);
                    }
                    case 0 -> seguir = false;
                }

                if (seguir) {
                    System.out.println("Subtotal actual: " + cafe.getPrecio());
                }
            }

            System.out.println("\nPedido Café " + i + ": " + cafe.getDescrip());
            System.out.println("Precio: " + cafe.getPrecio());
            pedidos.add(cafe);
        }

        int totalGeneral = pedidos.stream().mapToInt(Topping::getPrecio).sum();
        System.out.println("\n==== RESUMEN PEDIDO ====");
        System.out.println("Total a pagar: " + totalGeneral);

        sc.close();
    }
    private static int leerEntero(Scanner sc, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String in = sc.nextLine().trim();
            try {
                int i = Integer.parseInt(in);
                if (i < min || i > max) {
                    System.out.println("Ingrese un número entre " + min + " y " + max + ".");
                } else {
                    return i;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
            }
        }
    }
    private static String leerTextoNoVacio(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.out.println("No puede estar vacío.");
        }
    }
}
