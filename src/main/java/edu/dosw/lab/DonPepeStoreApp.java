package edu.dosw.lab;

public class DonPepeStoreApp {
    public static void main(String[] args) {

        System.out.println("Bienvenido a la tienda Don Pepe!\n");
        Product camiseta = new Product("Camiseta", 20000);
        Product pantalon = new Product("Pantalon", 50000);
        Product galletas = new Product("Galletas", 500);
        Product jugoNatural = new Product("Jugo Natural", 3.000);

        Client frecuentCustomer = new OldClient();

        Cart shopingCart = new Cart();
        shopingCart.putProduct(camiseta, 2);
        shopingCart.putProduct(galletas, 3);
        shopingCart.putProduct(jugoNatural, 5);

        Receipt receipt = new Receipt(frecuentCustomer, shopingCart);
        receipt.printReceipt();


    }
}
