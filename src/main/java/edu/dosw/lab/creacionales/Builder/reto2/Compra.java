package edu.dosw.lab.creacionales.Builder.reto2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Compra {
    public static LinkedHashMap<String, Integer> menu = new LinkedHashMap<>() {{
        put("Pan", 3000);
        put("Carne", 10000);
        put("Queso", 5000);
        put("Lechuga", 2000);
        put("Tomate", 2000);
        put("Salsa especial", 3000);
    }};

    public static Hamburguesa burger;
    private static Hamburguesa.Builder builder = new Hamburguesa.Builder();

    public static void ejecutar() {
        mostrarMenu();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione ingredientes para su hamburguesa: ");
        String[] opciones = scanner.nextLine().split(",");
        for (String op : opciones) {
            if(Integer.parseInt(op) <= menu.size()){
                ArrayList<String> claves = new ArrayList<>(menu.keySet());
                String nombreIngrediente = claves.get(Integer.parseInt(op)-1);
                Double precioIngrediente = menu.get(nombreIngrediente).doubleValue();
                builder.agregarIngrediente(nombreIngrediente, precioIngrediente);
            }else if(opciones.length == 0){
                System.out.println("Ingrediente no encontrado");
            }else{
                añadirNuevoIngrediente();
            }
        }
        System.out.println("\n----HAMBURGUESA PERSONALIZADA----");
        Hamburguesa hamburguesa = builder.build();
        System.out.println(hamburguesa);
        System.out.println("---------------------------------");
        System.out.println("Disfruta tu hamburguesa!");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("Los ingredientes disponibles son los siguientes:");

        int contador = 1;
        for (String i : menu.keySet()) {
            System.out.println(contador+". " + i + " ($" + menu.get(i) + ")");
            contador++;
        }
        // System.out.println(contador+". " + "Añade un nuevo ingrediente");
    }

    private static void añadirNuevoIngrediente(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nuevo ingrediente: ");
        String nuevoIngre = scanner.nextLine();
        System.out.print("Ingrese el valor del ingrediente: ");
        double precioIngre = scanner.nextInt();
        builder.agregarIngrediente(nuevoIngre, precioIngre);
        scanner.close();

        

    }
}