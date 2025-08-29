package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Creacional.Reto2;

import java.util.*;

public class BurgerApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Burger> order = new ArrayList<>();

        System.out.println("Bienvenido al Chef de 5 Estrellas!");
        boolean keepOrdering = true;

        while (keepOrdering) {
            BurgerBuilder builder = new BurgerBuilder();
            boolean addMore = true;

            System.out.println("\nCree su hamburguesa personalizada:");

            while (addMore) {
                System.out.println("\nSeleccione un ingrediente:");
                System.out.println("1. Pan ($1000)");
                System.out.println("2. Carne ($5000)");
                System.out.println("3. Queso ($2000)");
                System.out.println("4. Vegetales ($1500)");
                System.out.println("5. Salsa ($800)");
                System.out.print("Opción: ");
                int option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1 -> builder.addIngredient("Pan", 1000);
                    case 2 -> builder.addIngredient("Carne", 5000);
                    case 3 -> builder.addIngredient("Queso", 2000);
                    case 4 -> builder.addIngredient("Vegetales", 1500);
                    case 5 -> builder.addIngredient("Salsa", 800);
                    default -> System.out.println("Opción inválida");
                }

                System.out.print("¿Agregar otro ingrediente a esta hamburguesa? (s/n): ");
                String resp = sc.nextLine();
                addMore = resp.equalsIgnoreCase("s");
            }

            Burger burger = builder.build();
            order.add(burger);
            BurgerReceipt.print(burger);

            System.out.print("\n¿Desea ordenar otra hamburguesa? (s/n): ");
            String again = sc.nextLine();
            keepOrdering = again.equalsIgnoreCase("s");
        }

        BurgerReceipt.printMultiple(order);
    }
}
