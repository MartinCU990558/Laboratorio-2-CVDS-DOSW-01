package edu.dosw.lab.solid.Reto1TiendaDonPepe;

import java.util.*;
public class Carrito {
    private final Map<Producto, Integer> items = new HashMap<>();

    public void agregarProducto(Producto producto, int cantidad) {
        items.put(producto, items.getOrDefault(producto, 0) + cantidad);
        System.out.println(producto.getNombre() + " " + cantidad + " unidades agregado al carrito.");
    }

    public double getSubtotal() {
        return items.entrySet().stream()
                .mapToDouble(e -> e.getKey().getPrecio() * e.getValue())
                .sum();
    }

    public Map<Producto, Integer> getItems() { return items; }
}
