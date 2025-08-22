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
        cliente.carrito.añadiendoProductos(camisa2);
        Galletas galleta = new Galletas();
        Galletas galleta1 = new Galletas();
        Galletas galleta2 = new Galletas();
        cliente.carrito.añadiendoProductos(galleta);
        cliente.carrito.añadiendoProductos(galleta1);
        cliente.carrito.añadiendoProductos(galleta2);
        JugoNatural jugo = new JugoNatural();
        JugoNatural jugo1 = new JugoNatural();
        JugoNatural jugo2 = new JugoNatural();
        cliente.carrito.añadiendoProductos(jugo);
        cliente.carrito.añadiendoProductos(jugo1);
        cliente.carrito.añadiendoProductos(jugo2);
        

    }
}
