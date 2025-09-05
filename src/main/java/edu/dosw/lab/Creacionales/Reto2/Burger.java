package edu.dosw.lab.Creacionales.Reto2;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que hace referencia al producto estrella
 * personalizable.
 */
public class Burger {
    private List<Ingredients> ingredientes = new ArrayList<>();

    public void añadirIngrediente(Ingredients ingrediente) {
        ingredientes.add(ingrediente);
    }

    public double precioTotal(){
        return ingredientes.stream()
                .mapToDouble(Ingredients::getPrecioIngrediente)
                .sum();
    }

    @Override
    public String toString() {
        String listaIngredientes = ingredientes.stream()
                .map(Ingredients::toString)
                .reduce((a, b) -> a + ", " + b).orElse("");

        return "Los ingredientes con los que su hamburgueja se preparó fueron:\n" + listaIngredientes
                + "\nTotal: $" + precioTotal();
    }
}