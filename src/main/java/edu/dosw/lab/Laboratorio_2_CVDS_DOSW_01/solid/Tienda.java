package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.solid;

import java.util.*;

public class Tienda{
    private List<Producto> productosDisponibles = new ArrayList<>();

    public Producto crearProducto(String nombre, int precio){

        Producto p = new Producto(precio, nombre);
        productosDisponibles.add(p);
        return p;
    }

    public Optional<Producto> buscarPorNombre(String nombre){
        return productosDisponibles.stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }


}