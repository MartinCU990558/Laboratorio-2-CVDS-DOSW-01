package edu.dosw.lab.Solid.Reto1;

public class Reto1 {
    public static void ejecutar() {
        Producto camiseta = new Producto("Camiseta", 20000);
        Producto galletas = new Producto("Galletas", 500);
        Producto jugo = new Producto("Jugo Natural", 3000);

        Cliente cliente = new ClienteFrecuente("Frecuente");

        CarritodeCompras carrito = new CarritodeCompras();
        carrito.agregarProducto(camiseta, 2);
        carrito.agregarProducto(galletas, 3);
        carrito.agregarProducto(jugo, 5);

        Irecibo generador = new Imrecibo();
        generador.generar(cliente, carrito);
    }
}
