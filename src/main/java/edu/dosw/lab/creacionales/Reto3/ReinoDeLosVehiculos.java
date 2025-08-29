package edu.dosw.lab.creacionales.Reto3;

import java.util.*;
import java.text.DecimalFormat;

public class ReinoDeLosVehiculos {
    public static void ejecutar3() {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> cart = new ArrayList<>();

        DecimalFormat pesosFormat = new DecimalFormat("#,###");
        System.out.println("¡Bienvenido al Reino de los Vehículos!");

        boolean next = true;
        while (next) {
            System.out.println("Seleccione el tipo de vehículo:");
            System.out.println("1. Tierra");
            System.out.println("2. Acuático");
            System.out.println("3. Aéreo");
            System.out.print("Ingrese opción: ");
            int optionType = scanner.nextInt();
            TypeVehicle tipoSeleccionado = (optionType == 1) ? TypeVehicle.TIERRA :
                                            (optionType == 2) ? TypeVehicle.ACUATICO :
                                            TypeVehicle.AEREO;

            System.out.println("\nSeleccione la categoría del vehículo:");
            System.out.println("1. Económico");
            System.out.println("2. Lujo");
            System.out.println("3. Usado");
            System.out.print("Ingrese opción: ");
            int optionCategory = scanner.nextInt();
            CategoryVehicle categoriaSeleccionada = (optionCategory == 1) ? CategoryVehicle.ECONOMICO :
                                                      (optionCategory == 2) ? CategoryVehicle.LUJO :
                                                      CategoryVehicle.USADO;


            ModelVehicle modeloSeleccionado = ModelVehicle.AUTO;
            System.out.println("\nSeleccione el modelo de vehículo:");
            if (tipoSeleccionado == TypeVehicle.TIERRA) {
                System.out.println("1. Auto\n2. Bicicleta\n3. Moto");
                System.out.print("Ingrese opción: ");
                int option = scanner.nextInt();
                modeloSeleccionado = (option == 1) ? ModelVehicle.AUTO :
                                     (option == 2) ? ModelVehicle.BICICLETA :
                                     ModelVehicle.MOTO;
            } else if (tipoSeleccionado == TypeVehicle.ACUATICO) {
                System.out.println("1. Lancha\n2. Velero\n3. Jet Ski");
                System.out.print("Ingrese opción: ");
                int option = scanner.nextInt();
                modeloSeleccionado = (option == 1) ? ModelVehicle.LANCHA :
                                     (option == 2) ? ModelVehicle.VELERO :
                                     ModelVehicle.JETSKI;
            } else if (tipoSeleccionado == TypeVehicle.AEREO) {
                System.out.println("1. Avión\n2. Avioneta\n3. Helicóptero");
                System.out.print("Ingrese opción: ");
                int option = scanner.nextInt();
                modeloSeleccionado = (option == 1) ? ModelVehicle.AVION :
                                     (option == 2) ? ModelVehicle.AVIONETA :
                                     ModelVehicle.HELICOPTERO;
            }

            Vehicle vehiculo = new VehicleBuilder()
                    .setModel(modeloSeleccionado)
                    .setCategory(categoriaSeleccionada)
                    .build();

            cart.add(vehiculo);

            System.out.print("¿Desea agregar otro vehículo? (si/no): ");
            scanner.nextLine();
            String respuesta = scanner.nextLine().toLowerCase();
            next = respuesta.equals("si");
        }


        System.out.println("---- RESUMEN DE COMPRA ----");
        for (int i = 0; i < cart.size(); i++) {
            Vehicle vehiculo = cart.get(i);
            System.out.println("\nVehículo " + (i + 1) + ":");
            System.out.println("Tipo: " + vehiculo.getType());
            System.out.println("Categoría: " + vehiculo.getCategory());
            System.out.println("Velocidad máxima: " + vehiculo.getMaxSpeed() + " km/h");
            System.out.println("Precio: " + "$" + pesosFormat.format(vehiculo.getPrice()));
            System.out.println("Equipamiento: " + vehiculo.getEquipment());
        }

        long subtotal = cart.stream().mapToLong(Vehicle::getPrice).sum();
        long disccount = 0L;
        long total = subtotal - disccount;

        System.out.println("\nSubtotal: " + "$" + pesosFormat.format(subtotal));
        System.out.println("Descuento aplicado: " + "$"  + pesosFormat.format(disccount));
        System.out.println("Total a pagar: " + "$" +  pesosFormat.format(total));
        System.out.println("--------------------------------");
        System.out.println("¡Gracias por su compra en el Reino de los Vehículos!");
    }
}
