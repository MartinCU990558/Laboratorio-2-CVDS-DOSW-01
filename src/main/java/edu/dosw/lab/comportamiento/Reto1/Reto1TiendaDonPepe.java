package edu.dosw.lab.comportamiento.Reto1;

public class Reto1TiendaDonPepe {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda Don Pepe!");
        Producto camiseta = new Producto("Camiseta", 20000);
        Producto pantalon = new Producto("Pantalón", 50000);
        Producto galletas = new Producto("Galletas", 500);
        Producto jugo = new Producto("Jugo Natural", 3000);
        Cliente cliente = new Cliente("Juan", new DescuentoFrecuente());
        Carrito carrito = new Carrito();
        carrito.agregarProducto(camiseta, 2);
        carrito.agregarProducto(galletas, 3);
        carrito.agregarProducto(jugo, 5);
        Tienda tienda = new Tienda("Don Pepe");
        tienda.generarRecibo(cliente, carrito);
    }
}
