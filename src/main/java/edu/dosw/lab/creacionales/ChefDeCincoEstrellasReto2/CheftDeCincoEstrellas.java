package edu.dosw.lab.creacionales.ChefDeCincoEstrellasReto2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;




public class ChefDeCincoEstrellas {
    private static final List<Ingrediente> INGREDIENTES_BASE = List.of(
            new Ingrediente("Pan", 3000),
            new Ingrediente("Carne", 10000),
            new Ingrediente("Queso", 5000),
            new Ingrediente("Lechuga", 2000),
            new Ingrediente("Tomate", 2000),
            new Ingrediente("Salsa especial", 3000)
    );

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        List<Ingrediente> opciones = new ArrayList<>(INGREDIENTES_BASE);

        System.out.println("Seleccione ingredientes para su hamburguesa:");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ". " + opciones.get(i).getNombre() + " ($" + String.format("%,d", opciones.get(i).getPrecio()) + ")");
        }
        System.out.println((opciones.size() + 1) + ". Agregar nuevo ingrediente");

        System.out.print("Ingrese los números separados por coma: ");
        String[] seleccion = scanner.nextLine().split(",");

        HamburguesaBuilder builder = new HamburguesaBuilder();

        for (String s : seleccion) {
            int opcion = Integer.parseInt(s.trim());

            if (opcion >= 1 && opcion <= opciones.size()) {
                builder.agregarIngrediente(opciones.get(opcion - 1));
            } else if (opcion == opciones.size() + 1) {
                System.out.print("Ingrese el nombre del nuevo ingrediente: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el precio del ingrediente: ");
                int precio = Integer.parseInt(scanner.nextLine().replace(".", "").replace(",", ""));
                Ingrediente nuevo = new Ingrediente(nombre, precio);
                builder.agregarIngrediente(nuevo);
            }
        }

        Hamburguesa hamburguesa = builder.build();
        hamburguesa.mostrarHamburguesa();
    }

    public static void main(String[] args) {
        ejecutar();
    }

}
