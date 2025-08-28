
import java.util.*;

public class CarritoCompras {
    private final Cliente cliente;
    private final List<ItemCarrito> items = new ArrayList<>();
    private final EstrategiaDescuento estrategiaDescuento;

    public CarritoCompras(Cliente cliente, EstrategiaDescuento estrategiaDescuento) {
        this.cliente = cliente;
        this.estrategiaDescuento = estrategiaDescuento;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        items.add(new ItemCarrito(producto, cantidad));
        System.out.println(producto.getNombre() + " " + cantidad + " unidades agregado al carrito.");
    }

    public void imprimirRecibo() {
        double subtotal = items.stream().mapToDouble(ItemCarrito::getTotal).sum();
        double descuento = estrategiaDescuento.aplicarDescuento(subtotal);
        double total = subtotal - descuento;

        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getTipo());
        items.forEach(i -> System.out.println(i.getProducto().getNombre() + " - $" + i.getTotal()));
        System.out.println("\nSubtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + total);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}

   