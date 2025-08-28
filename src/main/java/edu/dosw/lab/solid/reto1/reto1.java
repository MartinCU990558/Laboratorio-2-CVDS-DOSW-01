package edu.dosw.lab.solid.reto1;

import java.util.Scanner;

public class reto1 {
    private static Scanner sc = new Scanner(System.in); 
    
    public static void ejecutar() { 
        Carrito carrito = new Carrito();
        
        System.out.println("¡Bienvenido a la tienda de Don Pepe!");
        System.out.print("Cliente: ");
        String tipoCliente = sc.nextLine();
        
        CatalogoProductos.mostrarProductosDisponibles();
        
        capturarCompras(carrito);
        
        Factura.mostrarRecibo(carrito, tipoCliente);
    }
    
    private static void capturarCompras(Carrito carrito) {
        while (true) {
            System.out.println("--- AGREGAR PRODUCTOS ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Finalizar compra");
            System.out.print("Seleccione opción: ");
            
            int opcion = sc.nextInt();
            sc.nextLine(); 
            
            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombreProducto = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    
                    if (carrito.agregarProducto(nombreProducto, cantidad)) {
                        System.out.println(nombreProducto + " " + cantidad + " unidades agregado al carrito");
                    } else {
                        System.out.println("Producto no encontrado: " + nombreProducto);
                    }
                    break;
                    
                case 2:
                    return;
                    
                default:
                    System.out.println("Opción invalida");
            }
        }
    }
    
}
