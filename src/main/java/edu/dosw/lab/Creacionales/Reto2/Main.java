package edu.dosw.lab.Creacionales.Reto2;
import java.util.*;

public class Main {
    public static void ejecutar() {
        Map<Integer, Ingredients> menu = new TreeMap<>(Map.of(
                1, new Ingredients("Pan", 3000.0),
                2, new Ingredients("Carne", 10000.0),
                3, new Ingredients("Queso", 5000.0),
                4, new Ingredients("Tomate", 2000.0),
                5, new Ingredients("Lechuga", 2000.0),
                6, new Ingredients("Salsa Especial", 3000.0)));

        BurgerBuilder hamburguejaBuilder = new BurgerBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Menú Hamburguejas Al Vapor ===");
        menu.forEach((k, v) -> System.out.println(k + ". " + v));
        System.out.println("Si desea finalizar ingrese la opción 0.\n" +
                "Si quiere añadir un ingrediente extra (ajeno al menú) ingrese la opción 7.");

        while (true) {
            System.out.println("Ingrese una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 0) break;

            if (option == 7) {
                System.out.print("Nombre del nuevo ingrediente: ");
                String nuevoNombreIngrediente = scanner.nextLine();

                System.out.print("Precio del nuevo ingrediente: ");
                double nuevoPrecioIngrediente = scanner.nextDouble();
                scanner.nextLine();

                Ingredients nuevoIngrediente = new Ingredients(nuevoNombreIngrediente, nuevoPrecioIngrediente);
                hamburguejaBuilder.añadir(nuevoIngrediente);
            } else {
                Ingredients ingr = menu.get(option);
                if (ingr != null) {
                    hamburguejaBuilder.añadir(ingr);
                } else {
                    System.out.println("Opción no válida.");
                }
            }
        }
        Burger miHamburgueja = hamburguejaBuilder.build();
        System.out.println("=== Su Hamburgueja Al Vapor ===");
        System.out.println(miHamburgueja);
    }
}