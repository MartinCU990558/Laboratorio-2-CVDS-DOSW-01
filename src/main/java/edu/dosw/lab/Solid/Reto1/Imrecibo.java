
package edu.dosw.lab.Solid.Reto1;

public class Imrecibo implements Irecibo {
    @Override
    public void generar(Cliente cliente, CarritodeCompras carrito) {
        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Productos:");

        carrito.getItems().forEach(item -> {
            System.out.println("- " + item.getProducto().getNombreProducto() + " - $" + (int) item.getSubtotal());
        });

        double subtotal = carrito.calcularSubtotal();
        double descuento = cliente.calcularDescuento(subtotal);
        double total = subtotal - descuento;

        System.out.println("\nSubtotal: $" + (int) subtotal);
        System.out.println("Descuento aplicado: $" + (int) descuento);
        System.out.println("Total a pagar: $" + (int) total);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}