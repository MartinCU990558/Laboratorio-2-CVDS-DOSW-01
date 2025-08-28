package edu.dosw.lab.comportamiento;

class ItemCarrito {
    private final Producto producto;
    private final int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return producto.getPrecioUnitario() * cantidad;
    }
}