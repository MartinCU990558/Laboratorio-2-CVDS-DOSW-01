package edu.dosw.lab.creacionales.Builder.reto2;
import java.util.HashMap;

public class Hamburguesa {
    private HashMap<String, Double> ingredientes;
    private double precio;

    public Hamburguesa(Builder builder) {
        this.ingredientes = new HashMap<>(builder.ingredientes);
        this.precio = ingredientes.values().stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ingredientes Seleccionados: ");
        for (String nombre : ingredientes.keySet()) {
            sb.append(nombre).append(", ");
        }

        if (!ingredientes.isEmpty()) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("\nPrecio total: ");
        sb.append(this.precio);

        return sb.toString();
    }
    public static class Builder {
        private HashMap<String, Double> ingredientes = new HashMap<>();

        public Builder agregarIngrediente(String nombre, Double precio) {
            ingredientes.put(nombre, precio);
            return this;
        }

        public Hamburguesa build() {
            return new Hamburguesa(this);
        }
    }
}
