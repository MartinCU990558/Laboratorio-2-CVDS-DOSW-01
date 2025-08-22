package edu.dosw.lab.creacionales.Builder.reto2;
import java.util.Map;

public class Compra {
    public static Map<String, Double> menu;
    public static void main(String[] args) {
        menu = menuIngredientes.obtenerIngredientes();
        System.out.println("Los ingredientes disponibles son los siguientes:");
        int contador = 1;
        for (String i : menu.keySet()) {
            Ingrediente ingrediente = new Ingrediente(i, menu.get(i));
            System.out.println(contador+". " + ingrediente);
            contador++;
        }
    }
}
