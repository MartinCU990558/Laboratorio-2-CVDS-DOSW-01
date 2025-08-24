package edu.dosw.lab;
import java.util.*;
public class ChefDe5Estrellas {
    private static Map<Integer,Ingredients> ingredientsMenu = new HashMap<>();
    private static ChefDe5Estrellas restaurant = new ChefDe5Estrellas();
    public ChefDe5Estrellas(){
        ingredientsMenu.put(1, new Ingredients("Pan",3000));
        ingredientsMenu.put(2, new Ingredients("Carne",10000));
        ingredientsMenu.put(3, new Ingredients("Queso",5000));
        ingredientsMenu.put(4, new Ingredients("Lechuga",2000));
        ingredientsMenu.put(5, new Ingredients("Tomate",2000));
        ingredientsMenu.put(6, new Ingredients("Salsa Especial",3000));
    }
    public static void ejecutar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione Los Ingredientes Para Su Hamburgesa: ");
        ingredientsMenu.forEach((key,ingredient)-> System.out.println(key + "." + ingredient.getName()
            + " ($" + ingredient.getPrice() + ")" ));
        System.out.println((ingredientsMenu.size() + 1) + ". Agregar un nuevo ingrediente");
        System.out.print("Ingrese Los Ingredientes Separados Por Coma: ");
        String input = sc.nextLine();

    }
    
}   
