package edu.dosw.lab.creacionales.Reto2;
import java.util.*;
public class ChefDe5Estrellas {
    private static Map<Integer,Ingredients> ingredientsMenu = new HashMap<>();
    private static ChefDe5Estrellas restaurant = new ChefDe5Estrellas();
    public ChefDe5Estrellas(){
        ingredientsMenu.put(1, new Ingredients("Pan",3.000));
        ingredientsMenu.put(2, new Ingredients("Carne",10.000));
        ingredientsMenu.put(3, new Ingredients("Queso",5.000));
        ingredientsMenu.put(4, new Ingredients("Lechuga",2.000));
        ingredientsMenu.put(5, new Ingredients("Tomate",2.000));
        ingredientsMenu.put(6, new Ingredients("Salsa Especial",3.000));
    }
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione ingredientes para su hamburguesa: ");
        ingredientsMenu.forEach((key, ingredient) -> 
            System.out.printf(Locale.US,"%d. %s ($%.3f)\n", key, ingredient.getName(), ingredient.getPrice()));

        System.out.println((ingredientsMenu.size() + 1) + ". Agregar un nuevo ingrediente");
        System.out.println("Ingrese los números de los ingredientes separados por coma:");

        String input = sc.nextLine();
        String[] seleccion = input.split(",");

        List<Ingredients> hamburguesa = new ArrayList<>();

        for (String s : seleccion) {
            int opcion;
            try {
                opcion = Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida: " + s);
                continue;
            }

            if (opcion == ingredientsMenu.size() + 1) {
                System.out.print("Ingrese el nombre del nuevo ingrediente: ");
                String nombre = sc.nextLine();
                System.out.print("Precio del ingrediente: ");
                double precio = Double.parseDouble(sc.nextLine());
                Ingredients nuevo = new Ingredients(nombre, precio);
                int key = ingredientsMenu.size() + 1;
                ingredientsMenu.put(key, nuevo);
                hamburguesa.add(nuevo);
            } else if (ingredientsMenu.containsKey(opcion)) {
                hamburguesa.add(ingredientsMenu.get(opcion));
            } else {
                System.out.println("Opción no válida: " + opcion);
            }
        }
    
        double total = 0;
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < hamburguesa.size(); i++) {
            Ingredients ing = hamburguesa.get(i);
            total += ing.getPrice();
            names.append(ing.getName());
            if (i < hamburguesa.size() - 1) {
                names.append(", ");
            }
        }

        String precioTotal = String.format(Locale.US, "%,.3f", total);

        System.out.println("\n--- HAMBURGUESA PERSONALIZADA ---");
        System.out.println("Ingredientes seleccionados: ");
        hamburguesa.forEach(i -> 
            System.out.printf(Locale.US,"%s ($%.3f)\n", i.getName(), i.getPrice()));
        System.out.println("Precio total: $" + precioTotal);
        System.out.println("-------------------------------");
        System.out.println("¡Disfrute su hamburguesa!");   
    }
}