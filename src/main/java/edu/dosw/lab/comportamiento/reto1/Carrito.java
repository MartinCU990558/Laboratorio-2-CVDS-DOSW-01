package edu.dosw.lab.comportamiento.reto1;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private final List<ItemCarrito> items = new ArrayList<>();
    private DescuentoStrategy descuentoStrategy;

    public void agregarProducto(Producto producto, int cantidad) {
        items.add(new ItemCarrito(producto, cantidad));
        System.out.println(producto.getNombre() + " " + cantidad + " unidades agregado al carrito.");
    }

    public void setDescuentoStrategy(DescuentoStrategy descuentoStrategy) {
        this.descuentoStrategy = descuentoStrategy;
    }

    public double getSubtotal() {
        return items.stream().mapToDouble(ItemCarrito::getTotal).sum();
    }

    public double getDescuento() {
        return descuentoStrategy != null ? descuentoStrategy.aplicarDescuento(getSubtotal()) : 0;
    }

    public double getTotal() {
        return getSubtotal() - getDescuento();
    }

    public List<ItemCarrito> getItems() {
        return items;
    }
}
