package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.solid;

import java.util.*;

public class CarritoCompras{

    private Map<Producto,Integer> productosComprados;

    public CarritoCompras(){
        productosComprados = new HashMap<>();
    }

    public void agregarProducto(Producto p, int cantidad){
        productosComprados.merge(p, cantidad, Integer::sum);
        System.out.println(p.getNombre() + " " + cantidad + " unidades agregado al carrito.");
    }

    public Map<Producto, Integer> getProductosComprados(){
        return Collections.unmodifiableMap(productosComprados);
    }

    public long calcularSubtotal(){
        return productosComprados.entrySet().stream()
                .mapToLong(e -> (long) e.getKey().getPrecio() * e.getValue()).sum();
    }

    public long calcularDescuentoAplicado(Cliente cliente){
        return Math.round(calcularSubtotal() * cliente.getDescuento());
    }

    public long calcularTotal(Cliente cliente){
        return calcularSubtotal() - calcularDescuentoAplicado(cliente);
    }

    public void imprimirRecibo(Cliente cliente){
        System.out.println();
        System.out.println("--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getTipo());
        System.out.println("Productos:");
        productosComprados.entrySet().stream()
                .forEach(e -> System.out.printf("- %s - $%,d%n", e.getKey().getNombre(), e.getKey().getPrecio() * e.getValue()));
        long subtotal = calcularSubtotal();
        long descuento = calcularDescuentoAplicado(cliente);
        long total = calcularTotal(cliente);
        System.out.printf("%nSubtotal: $%,d%n", subtotal);
        System.out.printf("Descuento aplicado: $%,d%n", descuento);
        System.out.printf("Total a pagar: $%,d%n", total);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }

}