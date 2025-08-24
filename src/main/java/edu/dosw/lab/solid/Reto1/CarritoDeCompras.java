package edu.dosw.lab.solid.Reto1;

import java.util.ArrayList;

public class CarritoDeCompras {
    private ArrayList<Producto> productos;

    public CarritoDeCompras() {
        productos = new ArrayList<>();
    }

    public void añadiendoProductos(Producto producto) {
        productos.add(producto);
    }

    public double total() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public double calculandoDescuento(TipoCliente tipo) {
        return (tipo.getValor() * total());
    }
}