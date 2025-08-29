package edu.dosw.lab.creacionales.Reto2;

import java.util.*;

public class HamburguesaBuilder {
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public HamburguesaBuilder() {}

    public HamburguesaBuilder agregarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
        return this;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return this.ingredientes;
    }

    public Hamburguesa build() {
        return new Hamburguesa(this.ingredientes);
    }

}
