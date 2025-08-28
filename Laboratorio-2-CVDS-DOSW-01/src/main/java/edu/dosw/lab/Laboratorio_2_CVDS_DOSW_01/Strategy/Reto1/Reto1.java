
import java.util.*;
public class Reto1 {
        
public static void run() {
    
       Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido a la tienda Don Pepe!");
    

        System.out.print("¿Es un cliente Nuevo o Frecuente? ");
        String tipoCliente = sc.nextLine();

        Cliente cliente = new Cliente(tipoCliente);
        EstrategiaDescuento descuento = tipoCliente.equalsIgnoreCase("Frecuente") ?
                new DescuentoClienteFrecuente() : new DescuentoClienteNuevo();

        List<Producto> productosDisponibles = Arrays.asList(
                new Producto("Camiseta", 20000),
                new Producto("Pantalón", 50000),
                new Producto("Galletas", 500),
                new Producto("Jugo Natural", 3000)
        );

        System.out.println("\nProductos disponibles:");
        productosDisponibles.forEach(p -> 
                System.out.println(p.getNombre() + " - $" + p.getPrecio()));

        CarritoCompras carrito = new CarritoCompras(cliente, descuento);

        
        System.out.println("\nIngrese la cantidad de cada producto que desea (0 si no quiere):");

        productosDisponibles.forEach(p -> {
            System.out.print(p.getNombre() + ": ha sido agregado ");
            int cantidad = sc.nextInt();
            if (cantidad > 0) {
                carrito.agregarProducto(p, cantidad);
            }
        });

        carrito.imprimirRecibo();
        sc.close();
}
}

