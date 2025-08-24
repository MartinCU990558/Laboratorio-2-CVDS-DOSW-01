package edu.dosw.lab.solid.Reto1;

public class Receipt {
    private Client client;
    private Cart cart;

    public Receipt(Client client, Cart cart){
        this.client = client;
        this.cart = cart;
    }

    public void printReceipt(){
        System.out.println("---RECIBO DE COMPRA---");
        System.out.println("Cliente" + " " + client.getType());
        System.out.println("Productos:");

        cart.getProducts().forEach((producto,cantidad)->{
            double totalProducto = producto.getPrice() * cantidad;
            System.out.println("-" + " "+ producto.getName() + " " + "-$" + String.format("%,.0f",totalProducto));
        });

        double subtotal = cart.getProducts().entrySet().stream().
                            mapToDouble(e->e.getKey().getPrice() * e.getValue()).sum();

        System.out.println("Subtotal: " + "$" + String.format("%,.0f",subtotal));

        double descuentoAplicado = client.calculateDiscount(subtotal);

        System.out.println("Descuento Aplicado: " + "$" + String.format("%,.0f",descuentoAplicado));

        double totalaPagar = subtotal- descuentoAplicado;

        System.out.println("Total a Pagar: " + "$" + String.format("%,.0f",totalaPagar));

        System.out.println("----------------------");
        System.out.println("¡Gracias Por su Compra!");


    }
}