package edu.dosw.lab.solid.reto1;

public class ItemCarrito {
    private final Producto producto; 
    private final int cantidad;      
    
    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }
    
    public int getCantidad() {
        return cantidad;
    }
}