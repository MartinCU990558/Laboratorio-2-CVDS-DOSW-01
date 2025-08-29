package edu.dosw.lab.comportamiento.reto1;

public class Tienda {
    public void generarRecibo(Cliente cliente, Carrito carrito) {
        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getTipo());
        System.out.println("Productos:");

        carrito.getItems().forEach(item ->
                System.out.println("- " + item.getProducto().getNombre() + " - $" + (int) item.getTotal())
        );

        System.out.println("\nSubtotal: $" + (int) carrito.getSubtotal());
        System.out.println("Descuento aplicado: $" + (int) carrito.getDescuento());
        System.out.println("Total a pagar: $" + (int) carrito.getTotal());
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}
