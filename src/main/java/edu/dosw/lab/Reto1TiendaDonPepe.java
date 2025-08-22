package edu.dosw.lab;
import edu.dosw.lab.CarritoDeCompras;
import edu.dosw.lab.Cliente;
import java.util.ArrayList;

public class Reto1TiendaDonPepe{
    private static ArrayList<Producto> productos;

    public Reto1TiendaDonPepe(){
        productos = new ArrayList<>();
    }
    public static void imprimiendoProductos(){
        productos.stream().forEach(e -> e.getPrecio());
    }
    public static void main(String args[]){
        System.out.println("Bienvenido a la tienda de Don Pepe!");
        CarritoDeCompras carrito = new CarritoDeCompras();
        Cliente cliente = new Cliente("Frecuente",carrito);
        imprimiendoProductos();
        System.out.println("Compra Realizada");
        Camiseta camisa = new Camiseta();
        Camiseta camisa2 = new Camiseta();
        cliente.carrito.añadiendoProductos(camisa);

    }
}
