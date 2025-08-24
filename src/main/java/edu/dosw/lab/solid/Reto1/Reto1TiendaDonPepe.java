package edu.dosw.lab.solid.Reto1;

import java.util.Scanner;

public class Reto1TiendaDonPepe {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la tienda de Don Pepe!");
        CarritoDeCompras carrito = new CarritoDeCompras();
        Cliente cliente = new Cliente(TipoCliente.FRECUENTE, carrito);
        Galletas galleta = new Galletas();
        JugoNatural jugoNatural = new JugoNatural();
        Pantalon pantalon = new Pantalon();
        Camiseta camiseta = new Camiseta();
        menu();
        int selection = scanner.nextInt();
        while (selection != 5) {
            int amount;
            switch (selection) {
                case 1:
                    System.out.println("Camiseta: ");
                    amount = scanner.nextInt();
                    for (int i = 0; i < amount; i++) {
                        carrito.añadiendoProductos(camiseta);
                    }
                    System.out.println("Camiseta: " + amount + " unidades agregadas al carrito: " + carrito.total());
                    break;
                case 2:
                    System.out.println("Pantalon: ");
                    amount = scanner.nextInt();
                    for (int i = 0; i < amount; i++) {
                        carrito.añadiendoProductos(pantalon);
                    }
                    System.out.println("Pantalon: " + amount + " unidades agregadas al carrito: " + carrito.total());
                    break;
                case 3:
                    System.out.println("Galletas: ");
                    amount = scanner.nextInt();
                    for (int i = 0; i < amount; i++) {
                        carrito.añadiendoProductos(galleta);
                    }
                    System.out.println("Galletas: " + amount + " unidades agregadas al carrito: " + carrito.total());
                    break;
                case 4:
                    System.out.println("Jugo Natural");
                    amount = scanner.nextInt();
                    for (int i = 0; i < amount; i++) {
                        carrito.añadiendoProductos(jugoNatural);
                    }
                    System.out
                            .println("Jugo Natural: " + amount + " unidades agregadas al carrito: " + carrito.total());
                    break;
                default:
                    break;
            }
            menu();
            selection = scanner.nextInt();
        }
        Factura factura = new Factura(carrito, cliente);
        factura.imprimirFactura();
    }

    public static void menu() {
        System.out.println("Productos disponibles");
        System.out.println("1. Camiseta   -    $20.000");
        System.out.println("2. Pantalon   -    $50.000");
        System.out.println("3. Galletas   -    $500");
        System.out.println("4. Jugo Natural   -    $3.000");
        System.out.println("5. Terminar carrito de compras");
    }
}
