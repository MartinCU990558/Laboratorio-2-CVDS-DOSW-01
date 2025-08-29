package edu.dosw.lab.comportamiento.reto1;

public class Reto1 {
    public static void ejecutar() {
        Producto camiseta = new Producto("Camiseta", 20000);
        Producto pantalon = new Producto("Pantalon", 50000);
        Producto galletas = new Producto("Galletas", 500);
        Producto jugo = new Producto("Jugo Natural", 3000);

        Cliente cliente = new Cliente("Juan", "Frecuente");

        Carrito carrito = new Carrito();
        carrito.agregarProducto(camiseta, 2);
        carrito.agregarProducto(galletas, 3);
        carrito.agregarProducto(jugo, 5);
        carrito.agregarProducto(pantalon, 1);

        if (cliente.getTipo().equalsIgnoreCase("Nuevo")) {
            carrito.setDescuentoStrategy(new NuevoClienteDescuento());
        } else {
            carrito.setDescuentoStrategy(new FrecuenteClienteDescuento());
        }

        Tienda tienda = new Tienda();
        tienda.generarRecibo(cliente, carrito);
    }
}
