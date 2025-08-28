package edu.dosw.lab.solid.reto1;

import java.util.List;

public class Factura {
    public Factura(List<Producto> productos){

    }

    public static void mostrarRecibo(Carrito carrito, String tipo) {
        System.out.println("--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + tipo);
        System.out.println("Productos:");
        
        double subtotal = 0;
        
        for (int i = 0; i < carrito.getItems().size(); i++) {
            ItemCarrito item = carrito.getItems().get(i);
            double totalItem = item.calcularSubtotal();
            subtotal += totalItem;
            
            System.out.printf("- %s - $%.0f%n", 
                item.getProducto().getNombre(), totalItem);
        }
        
        double porcentajeDescuento = Cliente.calcularDescuento(tipo);
        double descuento = subtotal * porcentajeDescuento;
        double total = subtotal - descuento;
        
        System.out.printf("Subtotal: $%.0f%n", subtotal);
        System.out.printf("Descuento aplicado: $%.0f%n", descuento);
        System.out.printf("Total a pagar: $%.0f%n", total);
        System.out.println("-------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}
