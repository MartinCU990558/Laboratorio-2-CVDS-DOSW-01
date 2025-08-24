package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.solid;

public class Reto1TiendaDonPepe {

    public static void ejecutar(){

        Tienda tienda = new Tienda();
        tienda.crearProducto("Camiseta", 20000);
        tienda.crearProducto("Pantalón", 50000);
        tienda.crearProducto("Galletas", 500);
        tienda.crearProducto("Jugo Natural", 3000);

        Cliente cliente = new Frecuente();
        CarritoCompras carrito = new CarritoCompras();

        tienda.buscarPorNombre("Camiseta").ifPresent(p -> carrito.agregarProducto(p, 2));
        tienda.buscarPorNombre("Galletas").ifPresent(p -> carrito.agregarProducto(p, 3));
        tienda.buscarPorNombre("Jugo Natural").ifPresent(p -> carrito.agregarProducto(p, 5));
        carrito.imprimirRecibo(cliente);
    }
}
