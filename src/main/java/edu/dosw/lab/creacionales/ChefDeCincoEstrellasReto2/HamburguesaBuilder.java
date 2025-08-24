package edu.dosw.lab.creacionales.ChefDeCincoEstrellasReto2;
import java.util.List;
import java.util.ArrayList;



public class HamburguesaBuilder {
    private final List<Ingrediente> ingredientes = new ArrayList<>();

    public HamburguesaBuilder agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
        return this;
    }

    public Hamburguesa build() {
        return new Hamburguesa(ingredientes);
    }

}
