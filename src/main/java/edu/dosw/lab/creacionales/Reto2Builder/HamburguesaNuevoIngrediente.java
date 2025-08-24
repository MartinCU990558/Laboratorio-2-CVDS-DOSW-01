package edu.dosw.lab.creacionales.Reto2Builder;

import java.util.ArrayList;

public class HamburguesaNuevoIngrediente {
    private ArrayList<Ingredientes> ingredientes;

    public HamburguesaNuevoIngrediente() {
        ingredientes = new ArrayList<>();
    }

    public void addingIngredientes(Ingredientes obj) {
        ingredientes.add(obj);
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void printIngredientes() {
        ingredientes.stream().map(Ingredientes::getNombre).forEach(System.out::println);
    }

    public double precioTotal() {
        return ingredientes.stream().mapToDouble(Ingredientes::getPrecio).sum();
    }
}
