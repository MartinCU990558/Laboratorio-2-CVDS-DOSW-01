package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Creacional.Reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Reto 2 - Patron Builder");
        System.out.println("===================================");
        System.out.println("Seleccione ingredientes para su hamburguesa: ");
        System.out.println("1. Pan ($3.000)");
        System.out.println("2. Carne ($10.000)");
        System.out.println("3. Queso ($5.000)");
        System.out.println("4. Lechuga ($2.000)");
        System.out.println("5. Tomate ($2.000)");
        System.out.println("6. Salsa Especial ($3.000)");
        System.out.println("7. Agregar nuevo ingrediente");

        System.out.println("Ingrese los numeros separados por comas de los ingredientes que desea agregar a su hamburguesa: ");
        
        String ingredientes = scanner.nextLine();
        String[] ingredientesCliente = ingredientes.split(",");

        List<Integer> ingredientesSeleccionados = new ArrayList<>();
        for(String i: ingredientesCliente){
                int ingredienteNum = Integer.parseInt(i.trim());
                ingredientesSeleccionados.add(ingredienteNum);
        }
        Builder builder = new Builder();

        for(int i: ingredientesSeleccionados){
            builder.agregarIngrediente(i);

            if(i == 7){
                System.out.println("Ingrese el nombre del nuevo ingrediente: ");
                String nombreIngrediente = scanner.nextLine();
                System.out.println("Ingrese el precio del nuevo ingrediente: ");
                int precioIngrediente = Integer.parseInt(scanner.nextLine());

                builder.agregarNuevoIngrediente(nombreIngrediente, precioIngrediente);
            } 
        }
        Hamburguesa hamburguesa = builder.build();
        System.out.println("--- HAMBURGUESA PERSONALIZADA ---");
        System.out.println("Ingredientes seleccionados: " + ingredientes);
        System.out.println("Precio total: $" + hamburguesa.getPrecioTotal());
        System.out.println("---------------------------------------");
        System.out.println("¡Disfrute su hamburguesa!");
        scanner.close();
    }    
}
