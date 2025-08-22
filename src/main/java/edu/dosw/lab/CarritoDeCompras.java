package edu.dosw.lab;

import java.util.ArrayList;
public class CarritoDeCompras{
    private ArrayList <Producto> productos;
    public double total(){
        return productos.stream().forEach(e -> e.getPrecio()).mapToDouble(Double::doubleValue()).sum();
    }
    public void añadiendoProductos(Producto producto){
        productos.add(producto);
    }
}