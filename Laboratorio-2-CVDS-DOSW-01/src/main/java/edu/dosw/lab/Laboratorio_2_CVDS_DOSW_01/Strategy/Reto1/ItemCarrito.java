package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Strategy.Reto1;

public class ItemCarrito {
        private final Producto producto;
        private final int cantidad;

        public ItemCarrito(Producto producto, int cantidad) {
            this.producto = producto;
            this.cantidad = cantidad;
        }

        public Producto getProducto() { return producto; }
        public int getCantidad() { return cantidad; }
        public double getTotal() { return producto.getPrecio() * cantidad; }
    }