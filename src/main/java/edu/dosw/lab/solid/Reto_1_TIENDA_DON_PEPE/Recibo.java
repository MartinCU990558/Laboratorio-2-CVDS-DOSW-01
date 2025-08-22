package edu.dosw.lab.solid.Reto_1_TIENDA_DON_PEPE;


public class Recibo {
    public static void imprimir(Carrito carrito, Cliente cliente) {
        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getTipo());
        System.out.println("Productos:");

        carrito.getItems().forEach((producto, cantidad) -> {
            double subtotal = producto.getPrecio() * cantidad;
            System.out.println("- " + producto.getNombre() + " - $" + (int)subtotal);
        });

        double subtotal = carrito.getSubtotal();
        double descuento = cliente.calcularDescuento(subtotal);
        double total = subtotal - descuento;

        System.out.println("\nSubtotal: $" + (int)subtotal);
        System.out.println("Descuento aplicado: $" + (int)descuento);
        System.out.println("Total a pagar: $" + (int)total);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}