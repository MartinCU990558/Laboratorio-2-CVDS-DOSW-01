package edu.dosw.lab.comportamiento;

class Tienda {
    private final String nombre;

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public void generarRecibo(Cliente cliente, Carrito carrito) {
        double subtotal = carrito.calcularSubtotal();
        double descuento = cliente.calcularDescuento(subtotal);
        double total = subtotal - descuento;

        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getTipo());
        System.out.println("Productos:");
        carrito.getItems().forEach(item ->
                System.out.println("- " + item.getProducto().getNombre() + " - $" + (int) item.getTotal())
        );

        System.out.println("\nSubtotal: $" + (int) subtotal);
        System.out.println("Descuento aplicado: $" + (int) descuento);
        System.out.println("Total a pagar: $" + (int) total);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}
