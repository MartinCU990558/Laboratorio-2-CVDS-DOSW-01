package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Reto1 {

    static final class Producto {
        private final String nombre;
        private final double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() { return nombre; }
        public double getPrecio() { return precio; }
    }

   
    static class ItemCarrito {
        private final Producto producto;
        private final int cantidad;

        public ItemCarrito(Producto producto, int cantidad) {
            this.producto = producto;
            this.cantidad = cantidad;
        }

        public Producto getProducto() { return producto; }
        public int getCantidad() { return cantidad; }
        public double getTotal() { return producto.getPrecio() * cantidad; }
    }

    
    static class Cliente {
        private final String tipo; 

        public Cliente(String tipo) {

            this.tipo = tipo;
        }

        public String getTipo() { return tipo; }
    }

    interface EstrategiaDescuento {
        double aplicarDescuento(double total);
    }


    static class DescuentoClienteNuevo implements EstrategiaDescuento {
        @Override
        public double aplicarDescuento(double total) {
            return total * 0.05; 
        }
    }

    static class DescuentoClienteFrecuente implements EstrategiaDescuento {
        @Override
        public double aplicarDescuento(double total) {
            return total * 0.10; 
        }
    }

    static class CarritoCompras {
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
            items.forEach(i -> System.out.println(
                    i.getProducto().getNombre() + " - $" + i.getTotal()));
            System.out.println("\nSubtotal: $" + subtotal);
            System.out.println("Descuento aplicado: $" + descuento);
            System.out.println("Total a pagar: $" + total);
            System.out.println("------------------------");
            System.out.println("¡Gracias por su compra!");
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido a la tienda Don Pepe!");
    

        System.out.print("¿Es un cliente Nuevo o Frecuente? ");
        String tipoCliente = sc.nextLine();

        Cliente cliente = new Cliente(tipoCliente);
        EstrategiaDescuento descuento = tipoCliente.equalsIgnoreCase("Frecuente") ?
                new DescuentoClienteFrecuente() : new DescuentoClienteNuevo();

        // Lista de productos disponibles
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

        // Elegir productos con Streams
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