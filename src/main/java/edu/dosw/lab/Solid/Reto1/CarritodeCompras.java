package edu.dosw.lab.Solid.Reto1;
import edu.dosw.lab.Solid.Reto1.ItemCarrito;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CarritoDeCompras {
    private final List<ItemCarrito> items = new ArrayList<>();

    public void agregarProducto(Producto producto, int cantidad) {
        items.add(new ItemCarrito(producto, cantidad));
        System.out.println(producto.getNombreProducto() + " " + cantidad + " unidades agregado al carrito.");
    }

    public double calcularSubtotal() {
        return items.stream().mapToDouble(ItemCarrito::getSubtotal).sum();
    }

    public List<ItemCarrito> getItems() {
        return items;
    }
}