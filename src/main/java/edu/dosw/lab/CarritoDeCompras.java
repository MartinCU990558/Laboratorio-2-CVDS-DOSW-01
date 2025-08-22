package edu.dosw.lab;

import java.util.ArrayList;
public class CarritoDeCompras{
    private ArrayList <Producto> productos;

    public void añadiendoProductos(Producto producto){
        productos.add(producto);
    }

    public double total(){
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
    
}