package edu.dosw.lab.creacionales.Reto2Builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reto2ChefCincoEstrellas {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione ingredientes para su hamburguesa: ");
        options();
        String seleccion = scanner.nextLine();
        System.out.println("Ingrese los numeros separados por coma: " + seleccion);
        System.out.println();
        List<Integer> ingreso = Arrays.stream(seleccion.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        if (ingreso.contains(7)) {
            System.out.println("Ingrese el nombre del nuevo ingrediente: ");
            String nuevoIngrediente = scanner.nextLine();
            System.out.println("Ingrese el precio del ingrediente: ");
            double precio = scanner.nextDouble();
        }
        output();

    }

    public static void options() {
        System.out.println("1. Pan ($3.000)");
        System.out.println("2. Carne ($10.000)");
        System.out.println("3. Queso ($5.000)");
        System.out.println("4. Lechuga ($2.000)");
        System.out.println("5. Tomate ($2.000)");
        System.out.println("6. Salsa Especial ($3.000)");
        System.out.println("7. Agregar un nuevo ingrediente");
    }

    public static void output() {
        System.out.println("--- HAMBURGUESA PERSONALIZADA ---");
        Director director = new Director();

        HamburguesaNuevoIngredienteBuilder builder = new HamburguesaNuevoIngredienteBuilder();
        director.construirHamburguesa(builder);

        HamburguesaNuevoIngrediente resultadoHamburguesa = builder.getHamburguesaNuevoIngrediente();
        System.out.println("Ingredientes seleccionados: ");
        resultadoHamburguesa.printIngredientes();
        System.out.println("Precio total: " + resultadoHamburguesa.precioTotal());

        System.out.println("------------------------");
        System.out.println("!Disfrute su hamburguesa!");
    }
}
