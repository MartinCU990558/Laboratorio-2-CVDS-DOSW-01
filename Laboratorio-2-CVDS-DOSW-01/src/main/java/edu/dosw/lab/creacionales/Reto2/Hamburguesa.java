package edu.dosw.lab.creacionales.Reto2;

import java.util.ArrayList;

public class Hamburguesa {
    private ArrayList<Ingrediente> ingredientes;

    public Hamburguesa(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = new ArrayList<>(ingredientes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hamburguesa{ingredientes=");
        ingredientes.forEach(p -> sb.append(p.getNombre()).append(" ").append(p.getPrecio()).append(", "));
        sb.append('}');
        return sb.toString();
    }

    public double getPrecio() {
        double total = ingredientes
                .stream()
                .mapToDouble(Ingrediente::getPrecio)
                .sum();
        return total;
    }

}
