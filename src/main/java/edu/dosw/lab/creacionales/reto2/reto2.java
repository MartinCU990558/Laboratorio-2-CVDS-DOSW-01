package edu.dosw.lab.creacionales.reto2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class reto2{
    public void ejecutar(){
        Scanner scanner = new Scanner(System.in);
        HamburguesaBuilder builder = new HamburguesaBuilder();

        System.out.println("Seleccione los ingredientes para su hamburguesa (separados por comas):");
        System.out.println("1. Pan ($1000)");
        System.out.println("2. Carne ($10000)");
        System.out.println("3. Queso ($5000)");
        System.out.println("4. Lechuga ($2000)");
        System.out.println("5. Tomate ($2000)");
        System.out.println("6. Salsa Especial ($3000)");
        System.out.println("7. Agregar nuevo ingrediente");

        String entrada = scanner.nextLine();
        List<Integer> opciones = Arrays.stream(entrada.split(","))
                                       .map(String::trim)
                                       .map(Integer::parseInt)
                                       .toList();

        for (Integer opcion : opciones) {
            switch (opcion) {
                case 1:
                    builder.setPan(new Pan());
                    break;
                case 2:
                    builder.setCarne(new Carne());
                    break;
                case 3:
                    builder.setQueso(new Queso());
                    break;
                case 4:
                    builder.setLechuga(new Lechuga());
                    break;
                case 5:
                    builder.setTomate(new Tomate());
                    break;
                case 6:
                    builder.setSalsaEspecial(new SalsaEspecial());
                    break;
                case 7:
                    builder.setNuevoIngrediente();
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

        Hamburguesa hamburguesa = builder.build();
        System.out.println("\n--- HAMBURGUESA PERSONALIZADA ---");
        
        System.out.println("Ingredientes seleccionados: " +
        String.join(", ", hamburguesa.getIngredientes().stream().map(Ingredientes::getNombre)
                    .toList()));

        System.out.println("Precio total: $" + hamburguesa.getPrecioTotal());
        System.out.println("------------------------------");
        System.out.println("¡Disfrute su hamburguesa!");
        scanner.close();
    }
      
}