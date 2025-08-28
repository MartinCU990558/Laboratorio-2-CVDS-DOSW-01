package edu.dosw.lab.solid.reto1;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<ItemCarrito> items;  
    public Carrito(){
        this.items = new ArrayList<ItemCarrito>();
    }
    
    public boolean agregarProducto(String nombreProducto, int cantidad) {
        Producto producto = CatalogoProductos.buscarProducto(nombreProducto);
        
        if (producto == null) {
            return false;
        }
        ItemCarrito item = new ItemCarrito(producto, cantidad);
        items.add(item);
        return true;
    }
    
    public ArrayList<ItemCarrito> getItems() { 
        return items;
    }
    
    public double calcularSubtotal() {
        return items.stream()
            .mapToDouble(ItemCarrito::calcularSubtotal)
            .sum();
    }
}