package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.creacionales.Reto2;

import java.util.List;
import java.util.Map;

public class Builder {

    private List<Ingrediente> ingredientes = new ArrayList<>();

    private static final Map<Integer, Ingrediente> IngredientesDisponibles = Map.of(
            1, new Ingrediente("Pan", 2000),
            2, new Ingrediente("Carne", 5000),
            3, new Ingrediente("Queso", 1000),
            4, new Ingrediente("Lechuga", 500),
            5, new Ingrediente("Tomate", 500),
            6, new Ingrediente("Salsa Especial", 1500)
            
            );
    public Builder agregarIngrediente(int numeroIngrediente) {
        Ingrediente ingrediente = IngredientesDisponibles.get(numeroIngrediente);
        if (ingrediente != null) {
            ingredientes.add(ingrediente);
        } else {
            System.out.println("Ingrediente no válido: " + numeroIngrediente);
        }
        return this;
    }

    public Hamburguesa build() {
        Hamburguesa hamburguesa = new Hamburguesa(this);
        return hamburguesa;
    }
        
    


}
