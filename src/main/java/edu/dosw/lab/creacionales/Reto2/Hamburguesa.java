package edu.dosw.lab.creacionales.Reto2;
import java.util.List;
import java.util.stream.Collectors;

public class Hamburguesa {

    private List<Ingrediente> ingredientes;

    private Hamburguesa(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public double calcularPrecio() {
        return ingredientes.stream()
                .mapToDouble(Ingrediente::getPrecio)
                .sum();
    }

    @Override

    public String toString() {

        String lista = ingredientes.stream()
                .map(Ingrediente::toString)
                .collect(Collectors.joining(", "));

        return "Hamburguesa con: " + lista + "\nPrecio total: $" + calcularPrecio();

    }


    public static class Builder {

        private List<Ingrediente> ingredientes = new java.util.ArrayList<Ingrediente>();

        public Builder agregarIngrediente(Ingrediente ingrediente) {
            ingredientes.add(ingrediente);
            return this;
        }

        public Hamburguesa build() {
            return new Hamburguesa(ingredientes);

        }

    }

}


