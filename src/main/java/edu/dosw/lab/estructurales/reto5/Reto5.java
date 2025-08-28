package edu.dosw.lab.estructurales;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de cafés a personalizar: ");
        int cantidadCafes = Integer.parseInt(sc.nextLine());

        double totalGeneral = 0;

        for (int i = 1; i <= cantidadCafes; i++) {
            System.out.println("\n--- Café " + i + " ---");

            // café base
            Topping cafe = new CafeSimple();

            boolean seguir = true;
            while (seguir) {
                System.out.println("\nSeleccione topping:");
                System.out.println("1. Leche (+0.5)");
                System.out.println("2. Chocolate (+0.7)");
                System.out.println("3. Crema Batida (+0.8)");
                System.out.println("4. Añadir ingrediente personalizado");
                System.out.println("0. Terminar selección");

                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1 -> cafe = new Leche(cafe);
                    case 2 -> cafe = new Chocolate(cafe);
                    case 3 -> cafe = new CremaBatida(cafe);
                    case 4 -> cafe = new Menta(cafe);
                    case 5 -> {
                        System.out.print("Ingrese nombre del nuevo ingrediente: ");
                        String nombreNuevo = sc.nextLine();
                        System.out.print("Ingrese precio extra: ");
                        double precioNuevo = Double.parseDouble(sc.nextLine());
                        cafe = new IngredientePersonalizado(cafe, nombreNuevo, precioNuevo);
                    }
                    case 0 -> seguir = false;
                    default -> System.out.println("Opción no válida");
                }
            }
            System.out.println("\nPedido Café " + i + ": " + cafe.getDescrip());
            System.out.println("Precio: " + cafe.getPrecio());
            totalGeneral += cafe.getPrecio();
        }
        System.out.println("\n==== RESUMEN PEDIDO ====");
        System.out.println("Total a pagar: " + totalGeneral);

        sc.close();
    }
}
