package edu.dosw.lab.solid.reto1;
import java.util.List;
import java.util.Scanner;

public class TiendaDonPepe {
    private static List<Producto> menu = crearMenu();
    public static void ejecutar() {
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

        compra.entrySet().stream()
                .forEach(e -> System.out.printf("%s %d unidades agregado al carrito.\n",
                        e.getKey().getNombre(),
                        e.getValue()));


        System.out.println("\n--- Recibo de compra:---");
        System.out.println("Cliente: " + tipoCliente);
        System.out.println("Productos: ");
        int total = compra.entrySet().stream()
                .peek(e -> System.out.printf("%s: %d - $%,d\n",
                        e.getKey().getNombre(),
                        e.getValue(),
                        e.getKey().getPrecio() * e.getValue()))
                .mapToInt(e -> e.getKey().getPrecio() * e.getValue())
                .sum();

        System.out.printf("Subtotal: $%,d\n", total);
        System.out.printf("Descuento aplicado: $%,d", cliente.aplicarDescuento(total) );
        System.out.printf("\nTotal a pagar: $%,d", total - cliente.aplicarDescuento(total));
        System.out.println("\n-----------------------");
        System.out.println("!Gracias por su compra!");
        scanner.close();
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