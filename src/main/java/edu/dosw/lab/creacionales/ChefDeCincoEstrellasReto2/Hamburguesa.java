package edu.dosw.lab.creacionales.ChefDeCincoEstrellasReto2;
import java.util.List;
import java.util.stream.Collectors;



public class Hamburguesa {
    private final List<Ingrediente> ingredientes;

    public Hamburguesa(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void mostrarHamburguesa() {
        System.out.println("\n--- HAMBURGUESA PERSONALIZADA ---");
        System.out.print("Ingredientes seleccionados: ");
        System.out.println(ingredientes.stream().map(Ingrediente::getNombre).collect(Collectors.joining(", ")));
        int precioTotal = ingredientes.stream().mapToInt(Ingrediente::getPrecio).sum();
        System.out.println("Precio total: $" + String.format("%,d", precioTotal));
        System.out.println("-------------------------------------------");
        System.out.println("¡Disfrute de su hamburguesa!");
    }

}
