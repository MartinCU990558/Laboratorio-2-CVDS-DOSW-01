package edu.dosw.lab.solid.reto1;

import java.util.Arrays;
import java.util.List;

public class CatalogoProductos{
    private static final List<Producto> productosDisponibles = Arrays.asList(
        new Producto("Camiseta", 20000),
        new Producto("Pantalon", 50000),
        new Producto("Galletas", 500),
        new Producto("Jugo Natural", 3000)
    );
    
    public static void mostrarProductosDisponibles(){
        System.out.println("Productos disponibles:");
        productosDisponibles.forEach(p -> System.out.printf("- %s - $%.0f%n", p.getNombre(), p.getPrecio()));
}
    public static List<Producto> getListaProductosDisponibles(){
        return productosDisponibles;
    }

    public static Producto buscarProducto(String nombre) {
    return productosDisponibles.stream()
        .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
        .findFirst()
        .orElse(null);
    }
}