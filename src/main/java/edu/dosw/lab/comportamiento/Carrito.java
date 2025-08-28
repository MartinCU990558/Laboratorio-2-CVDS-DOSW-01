package edu.dosw.lab.comportamiento;

import java.util.ArrayList;
import java.util.List;

class Carrito {
    private final List<ItemCarrito> items = new ArrayList<>();

    public void agregarProducto(Producto producto, int cantidad) {
        items.add(new ItemCarrito(producto, cantidad));
        System.out.println(producto.getNombre() + " " + cantidad + " unidades agregado al carrito.");
    }

    public List<ItemCarrito> getItems() {
        return items;
    }

    public double calcularSubtotal() {
        return items.stream()
                .mapToDouble(ItemCarrito::getTotal)
                .sum();
    }
}
