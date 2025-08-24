package edu.dosw.lab.solid.Reto1;

import java.util.Scanner;

public class Reto1TiendaDonPepe {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Client frequentClient = new OldClient();
        System.out.println("Bienvenido a la tienda Don Pepe!");
        System.out.println(frequentClient.getType());
        System.out.println("Productos disponibles:");
        System.out.println(" - Camiseta - $20.000");
        System.out.println(" - Pantalón - $50.000");
        System.out.println(" - Galletas - $500");
        System.out.println(" - Jugo Natural - $3.000\n");

        Product camiseta = new Product("Camiseta", 20000);
        Product pantalon = new Product("Pantalon", 50000);
        Product galletas = new Product("Galletas", 500);
        Product jugoNatural = new Product("Jugo Natural", 3000);


        Cart shoppingCart = new Cart();

        System.out.println("Ingrese su compra (cantidad de cada producto):");

        System.out.print("Camiseta: ");
        int cantCamiseta = sc.nextInt();
        if (cantCamiseta > 0) {
            shoppingCart.putProduct(camiseta, cantCamiseta);
            System.out.println("• Camiseta " + cantCamiseta + " unidades agregado al carrito.");
        }
        System.out.print("Pantalón: ");
        int cantPantalon = sc.nextInt();
        if (cantPantalon > 0) {
            shoppingCart.putProduct(pantalon, cantPantalon);
            System.out.println("• Pantalón " + cantPantalon + " unidades agregado al carrito.");
        }
        System.out.print("Galletas: ");
        int cantGalletas = sc.nextInt();
        if (cantGalletas > 0) {
            shoppingCart.putProduct(galletas, cantGalletas);
            System.out.println("• Galletas " + cantGalletas + " unidades agregado al carrito.");
        }

        System.out.print("Jugo Natural: ");
        int cantJugo = sc.nextInt();
        if (cantJugo > 0) {
            shoppingCart.putProduct(jugoNatural, cantJugo);
            System.out.println("• Jugo Natural " + cantJugo + " unidades agregado al carrito.");
        }
        Receipt receipt = new Receipt(frequentClient, shoppingCart);
        receipt.printReceipt();

        sc.close();
    }
}