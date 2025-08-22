package edu.dosw.lab;
import edu.dosw.lab.CarritoDeCompras;
import edu.dosw.lab.Cliente;
import edu.dosw.lab.ClienteFrecuente;
import java.util.ArrayList;
import edu.dosw.lab.ClienteNuevo;

public class Reto1TiendaDonPepe{
    private static ArrayList<Producto> productos;

    public Reto1TiendaDonPepe(){
        productos = new ArrayList<>();
    }

    public static void main(String args[]){
        System.out.println("Bienvenido a la tienda de Don Pepe!");
        CarritoDeCompras carrito = new CarritoDeCompras();
        Cliente cliente = new Cliente("Frecuente",carrito);
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
        JugoNatural jugo3 = new JugoNatural();
        JugoNatural jugo4 = new JugoNatural();
        cliente.carrito.añadiendoProductos(jugo);
        cliente.carrito.añadiendoProductos(jugo1);
        cliente.carrito.añadiendoProductos(jugo2);
        cliente.carrito.añadiendoProductos(jugo3);
        cliente.carrito.añadiendoProductos(jugo4);
        
        System.out.println(carrito.total());
        
        

    }
}
