package edu.dosw.lab;

import java.util.ArrayList;
public class CarritoDeCompras{
    private ArrayList <Producto> productos;

    public CarritoDeCompras(){
        this.productos = new ArrayList<>();
    }

    public double total(){
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public void añadiendoProductos(Producto producto){
        productos.add(producto);
    }

    
}