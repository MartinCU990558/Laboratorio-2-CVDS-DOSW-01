package edu.dosw.lab.estructurales.CafePersonalizado;

import java.util.*;

public class CafePersonalizadoClase {

    private Map<Integer, Topping> listaToppings;

    public CafePersonalizadoClase() {
        listaToppings = new HashMap<>();
        listaToppings.put(1, new Topping("Leche", 1000));
        listaToppings.put(2, new Topping("Chocolate", 1500));
        listaToppings.put(3, new Topping("Caramelo", 1200));
        listaToppings.put(4, new Topping("Crema Batida", 2000));
        listaToppings.put(5, new Topping("Menta", 1300));

    }

    public void ejecutar() {
        List<Cafe> cafes = new ArrayList<>();

        int[] entradaCafe1 = {1, 3, 6};
        int[] entradaCafe2 = {2, 4};

        //Cafe1
        Cafe cafe1 = new Cafe();
        for (int opcion : entradaCafe1) {
            procesarOpcion(cafe1, opcion);
        }
        cafes.add(cafe1);

        //Cafe2
        Cafe cafe2 = new Cafe();
        for (int opcion : entradaCafe2) {
            procesarOpcion(cafe2, opcion);
        }
        cafes.add(cafe2);

        System.out.println("\n---- RESUMEN DE CAFE PERSONALIZADO ----");
        double totalGeneral = 0;
        for (int i = 0; i < cafes.size(); i++) {
            Cafe c = cafes.get(i);
            System.out.println("Cafe " + (i + 1) + ":");
            System.out.println("Ingredientes: " + c.getDescripcion());
            System.out.println("Precio total: $" + c.getPrecio() + "\n");
            totalGeneral += c.getPrecio();
        }

        System.out.println("Total a pagar por todos los cafes: $" + totalGeneral);
        System.out.println("¡Disfrute su cafe!");
    }

    private void procesarOpcion(Cafe cafe, int opcion) {
        if (opcion >= 1 && opcion <= 5) {
            cafe.agregarTopping(listaToppings.get(opcion));
        } else if (opcion == 6) {
            String nombre = "Almendra";
            double precio = 1800;
            cafe.agregarTopping(new Topping(nombre, precio));
        } else {
            System.out.println("Opcion invalida: " + opcion);
        }
    }
}