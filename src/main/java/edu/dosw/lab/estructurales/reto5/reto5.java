package edu.dosw.lab.estructurales.reto5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class reto5 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese La Cantidad de Cafes A Personalizar");

        int cantidadCafes = scanner.nextInt();
        scanner.nextLine();
        int contador = 0;
        int totalGeneral = 0;
        ArrayList<Topping> cafes = new ArrayList<>();

        while (contador < cantidadCafes) {
            Topping cafe = new Cafe();

            System.out.println("---- Cafe #" + (contador + 1) + " ---");
            System.out.println("Ingrese los números de toppings separados por comas:");
            System.out.println("1. Leche");
            System.out.println("2. Caramelo");
            System.out.println("3. Chocolate");
            System.out.println("4. Menta");
            System.out.println("5. Crema Batida");
            System.err.println("6. Agregar Nuevo Topping");

            String entrada = scanner.nextLine();

            List<Integer> opciones = Arrays.stream(entrada.split(","))
                                           .map(String::trim)
                                           .map(Integer::parseInt)
                                           .toList();

            for (Integer opcion : opciones) {
                switch (opcion) {
                    case 1:
                        cafe = new Leche(cafe);
                        break;
                    case 2:
                        cafe = new Caramelo(cafe);
                        break;
                    case 3:
                        cafe = new Chocolate(cafe);
                        break;
                    case 4:
                        cafe = new Menta(cafe);
                        break;
                    case 5:
                        cafe = new CremaBatida(cafe);
                        break;
                    case 6:
                        System.err.println("Ingrese el nombre del Topping:");
                        String nombreTopping = scanner.nextLine();
                        System.out.println("Ingrese el precio del Topping:");
                        int precioTopping = scanner.nextInt();
                        scanner.nextLine();
                        cafe = new NuevoTopping(cafe, nombreTopping, precioTopping);
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            }

            cafes.add(cafe);

            System.out.println("Precio final del café #" + (contador + 1) + ": " + cafe.getPrecio());
            System.out.println("Ingredientes: " + cafe.getDescripcion());
            contador++;
        }
        totalGeneral = cafes.stream().mapToInt(Topping::getPrecio).sum();
        System.out.println("El total de su compra es: " + totalGeneral);

        scanner.close();
    }
}
