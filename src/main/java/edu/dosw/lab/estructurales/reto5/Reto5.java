package edu.dosw.lab.estructurales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de cafés a personalizar: ");
        int cantidadCafes = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= cantidadCafes; i++) {
            System.out.println("\n--- Café " + i + " ---");
            System.out.println("Toppings disponibles:");
            for (int j = 0; j < Toppings.obtenerTodos().size(); j++) {
                System.out.println((j + 1) + ". " + Toppings.obtenerTodos().get(j));
            }

            System.out.print("Seleccione toppings (números separados por coma): ");
            String[] seleccion = sc.nextLine().split(",");
            List<Toppings> seleccionados = new ArrayList<>();

            for (String s : seleccion) {
                int index = Integer.parseInt(s.trim()) - 1;
                if (index >= 0 && index < Toppings.obtenerTodos().size()) {
                    seleccionados.add(Toppings.obtenerTodos().get(index));
                }
            }
            if (i == 1) {
                System.out.print("Ingrese nombre del nuevo topping: ");
                String nombreNuevo = sc.nextLine();
                System.out.print("Ingrese precio del topping: ");
                double precioNuevo = Double.parseDouble(sc.nextLine().replace(".", "").replace(",", "."));
                Topping nuevoTopping = new Topping(nombreNuevo, precioNuevo);
                toppingsDisponibles.add(nuevoTopping);
            }

            System.out.println("Toppings seleccionados para Café " + i + ":");
            for (Topping t : seleccionados) {
                System.out.println("- " + t);
            }
        }

        sc.close();
    }
}