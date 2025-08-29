package edu.dosw.lab.solid.reto1;

import java.util.List;
import java.util.Scanner;

public class TiendaDonPepe {
    private static List<Producto> menu = crearMenu();
    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda Don Pepe!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cliente: ");
        String tipoCliente = scanner.nextLine();
        Descuento cliente;
        switch (tipoCliente.toLowerCase()) {
            case "frecuente":
                cliente = new ClienteFrecuente();
                break;
            case "nuevo":
                cliente = new ClienteNuevo();
                break;
            default:
                System.out.println("No seleccionaste una opción correcta.");
                cliente = new ClienteNuevo();
        }

        System.out.println("Productos disponibles:");
        menu.stream()
                .forEach(p -> System.out.printf("- %s - $%,d\n", p.getNombre(), p.getPrecio()));

        System.out.println("Ingrese su compra:");
        java.util.LinkedHashMap<Producto, Integer> compra = new java.util.LinkedHashMap<>();
        for (Producto p : menu) {
            System.out.printf("%s: ", p.getNombre());
            Integer cantidad = scanner.nextInt();
            if (cantidad > 0) {
                compra.put(p, cantidad);
            }
        }


    }

    private static List<Producto> crearMenu() {
        return List.of(
                new Producto("camiseta", 20000),
                new Producto("pantalon", 50000),
                new Producto("galletas", 500),
                new Producto("jugoNatural", 3000)
        );
    }
}