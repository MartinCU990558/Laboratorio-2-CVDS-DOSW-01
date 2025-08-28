package edu.dosw.lab.estructurales.Reto5;

import java.util.*;
import java.util.stream.IntStream;

public class ElCafePerzonalizado {
    public static void ejectutar5() {
        Scanner scanner = new Scanner(System.in);
    
        Map<Integer, String[]> toppingsDisponibles = new HashMap<>();
        toppingsDisponibles.put(1, new String[]{"Leche", "500"});
        toppingsDisponibles.put(2, new String[]{"Chocolate", "1000"});
        toppingsDisponibles.put(3, new String[]{"Caramelo", "700"});
        toppingsDisponibles.put(4, new String[]{"Crema Batida", "1500"});
        toppingsDisponibles.put(5, new String[]{"Canela", "300"});
        toppingsDisponibles.put(6, new String[]{"Nuevo Topping", "0"}); 
        
        System.out.print("Número de cafés a personalizar: ");
        int numCafes = scanner.nextInt();
        scanner.nextLine();
    
        List<Coffee> cafesPorHacer = new ArrayList<>();
        
        IntStream.range(0, numCafes).forEach(i -> {
            System.out.println("\n--- Café " + (i + 1) + " ---");
            
            Coffee cafeBase = new BaseCoffee();
            
            System.out.print("Seleccione toppings (numeros separados por coma): ");
            String seleccionDeToppings = scanner.nextLine();
            
            String[] toppingsSeleccionados = seleccionDeToppings.split(",");
            
            for (String toppingKey : toppingsSeleccionados) {
                int keyToppins = Integer.parseInt(toppingKey.trim());
                
                if (keyToppins == 6) { 
                    System.out.print("Ingrese nombre del nuevo topping: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese precio del topping: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine(); 
                    cafeBase = new Toppings(cafeBase, nombre, precio);
                } else if (toppingsDisponibles.containsKey(keyToppins)) {
                    String[] topping = toppingsDisponibles.get(keyToppins);
                    cafeBase = new Toppings(cafeBase, topping[0], Double.parseDouble(topping[1]));
                }
            }
            
            cafesPorHacer.add(cafeBase);
        });
        
        System.out.println("\n--- RESUMEN DE CAFE PERSONALIZADO ---");
        
        IntStream.range(0, cafesPorHacer.size()).forEach(i -> {
            Coffee cafe = cafesPorHacer.get(i);
            System.out.println("\nCafé " + (i + 1) + ":");
            System.out.println("Ingredientes: " + cafe.getDescription());
            System.out.println("Precio total: $" + String.format("%,.0f", cafe.getPrice()));
        });
        
        double precioTotal = cafesPorHacer.stream().mapToDouble(Coffee::getPrice).sum();
        System.out.println("\n--------------------------------");
        System.out.println("Total a pagar por todos los cafés: $" + String.format("%,.0f", precioTotal));
        System.out.println("¡Disfrute su café!");
        
        scanner.close();
    }
}