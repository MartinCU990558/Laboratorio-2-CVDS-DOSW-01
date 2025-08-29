package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Creacional.Reto2;

import java.util.List;
import java.util.stream.Collectors;

public class Hamburguesa {
    
    private List<Ingrediente> ingredientes;

    public Hamburguesa(Builder builder) {
        this.ingredientes = builder.ingredientes;
    }

    public int getPrecioTotal() {
        return ingredientes.stream()
                            .mapToInt(Ingrediente::getPrecio)
                            .sum(); 
    }

    public String toString(){
         String ingredientesStr = ingredientes.stream()
                .map(Ingrediente::getNombre)
                .collect(Collectors.joining(", "));

        return ("Hamburgesa con: " + ingredientesStr + " - Precio: " + getPrecioTotal());
    }
    
}
