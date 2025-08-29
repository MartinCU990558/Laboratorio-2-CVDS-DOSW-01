package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Creacional.Reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Builder {

    List<Ingrediente> ingredientes = new ArrayList<>();

    private static final Map<Integer, Ingrediente> IngredientesDisponibles = Map.of(
            1, new Ingrediente("Pan", 3000),
            2, new Ingrediente("Carne", 10000),
            3, new Ingrediente("Queso", 5000),
            4, new Ingrediente("Lechuga", 2000),
            5, new Ingrediente("Tomate", 2000),
            6, new Ingrediente("Salsa Especial", 3000)
            );

    public Builder agregarIngrediente(int numeroIngrediente) {
        Ingrediente ingrediente = IngredientesDisponibles.get(numeroIngrediente);
        if(numeroIngrediente == 7){
            return null;
        } else if (ingrediente != null ) {
            ingredientes.add(ingrediente);
        } else {
            System.out.println("Ingrediente no disponible: " + numeroIngrediente);
        }   
        return this;
    }

    public Builder agregarNuevoIngrediente(String nombre, int precio){
        ingredientes.add(new Ingrediente(nombre, precio));
        return this;
    }

    public Hamburguesa build() {
        Hamburguesa hamburguesa = new Hamburguesa(this);

        return hamburguesa;
    }
        
    


}
