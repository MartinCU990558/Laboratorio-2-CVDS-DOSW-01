package edu.dosw.lab.creacionales.reto2;
import java.util.ArrayList;

public class Hamburguesa {
    private ArrayList<Ingredientes> ingredientes = new ArrayList<>();

    public Hamburguesa() {
    }
    
    public void agregarIngrediente(Ingredientes ingrediente){
        ingredientes.add(ingrediente);
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public int getPrecioTotal() {
        return ingredientes.stream().mapToInt(Ingredientes::getPrecio).sum();
    }
}

