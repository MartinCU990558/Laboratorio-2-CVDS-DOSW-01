package edu.dosw.lab.solid.Reto1;

public class Factura {
    private CarritoDeCompras carrito;
    private Cliente cliente;

    public Factura(CarritoDeCompras carrito, Cliente cliente) {
        this.carrito = carrito;
        this.cliente = cliente;
    }

    public void imprimirFactura() {
        System.out.println("--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getTipo());
        System.out.println("Subtotal: " + carrito.total());
        System.out.println("Descuento aplicado: " + carrito.calculandoDescuento(cliente.getTipo()));
        System.out.println("Total a Pagar: " + (carrito.total() - carrito.calculandoDescuento(cliente.getTipo())));
        System.out.println("--------------------------");
        System.out.println("Gracias por su compra!");
    }
}
