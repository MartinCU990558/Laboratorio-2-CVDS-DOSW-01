package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Creacional.Reto3;

import java.util.*;

public class ApplicationReto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> purchase = new ArrayList<>();
        System.out.println("Bienvenido al Reino de los Vehículos!");
        boolean keepBuying = true;

        while (keepBuying) {
            System.out.println("\nSeleccione un tipo de vehículo:");
            System.out.println("1. Auto");
            System.out.println("2. Moto");
            System.out.println("3. Bicicleta");
            System.out.println("4. Lancha");
            System.out.println("5. Velero");
            System.out.println("6. Jet Ski");
            System.out.println("7. Avión");
            System.out.println("8. Avioneta");
            System.out.println("9. Helicóptero");
            System.out.print("Opción: ");
            int option = sc.nextInt();
            sc.nextLine();

            String type = switch (option) {
                case 1 -> "car";
                case 2 -> "moto";
                case 3 -> "bike";
                case 4 -> "boat";
                case 5 -> "sailboat";
                case 6 -> "jetski";
                case 7 -> "plane";
                case 8 -> "smallplane";
                case 9 -> "helicopter";
                default -> throw new IllegalArgumentException("Opción inválida");
            };

            System.out.print("Seleccione la categoría (Económico, Lujo, Usado): ");
            String category = sc.nextLine();
            Vehicle vehicle = GeneralFactory.createVehicle(type, category);
            purchase.add(vehicle);
            System.out.print("¿Desea agregar otro vehículo? (s/n): ");
            String answer = sc.nextLine();
            keepBuying = answer.equalsIgnoreCase("s");
        }
        VehicleReceipt.print(purchase);
    }
}
