package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Reto5;


import java.util.*;

public class ApplicationReto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Coffee> order = new ArrayList<>();

        System.out.println("Bienvenido a la Cafetería Creativa!");
        boolean keepOrdering = true;

        while (keepOrdering) {
            Coffee coffee = new SimpleCoffee();
            boolean addMore = true;

            System.out.println("\nPersonaliza tu café:");

            while (addMore) {
                System.out.println("\nSeleccione un topping:");
                System.out.println("1. Leche (+$500)");
                System.out.println("2. Chocolate (+$1000)");
                System.out.println("3. Caramelo (+$1200)");
                System.out.println("4. Ninguno (terminar café)");
                System.out.print("Opción: ");
                int option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1 -> coffee = new Milk(coffee);
                    case 2 -> coffee = new Chocolate(coffee);
                    case 3 -> coffee = new Caramel(coffee);
                    case 4 -> addMore = false;
                    default -> System.out.println("Opción inválida");
                }

                if (option != 4) {
                    System.out.println("Topping agregado: " + coffee.getDescription());
                }
            }

            order.add(coffee);

            System.out.print("\n¿Desea ordenar otro café? (s/n): ");
            String again = sc.nextLine();
            keepOrdering = again.equalsIgnoreCase("s");
        }

        CoffeeReceipt.print(order);
    }
}
