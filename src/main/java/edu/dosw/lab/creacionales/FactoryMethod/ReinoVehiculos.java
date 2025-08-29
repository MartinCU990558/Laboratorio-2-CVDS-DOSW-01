package edu.dosw.lab.creacionales.FactoryMethod;

import java.util.ArrayList;
import java.util.Scanner;

public class ReinoVehiculos {
    public static void ejecutar() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        boolean opcion = true;
        Scanner scanner = new Scanner(System.in);

        while (opcion) {
            System.out.println("Bienvenido al Reino de los Vehículos");
            System.out.println("Seleccione el tipo de Vehículo");
            System.out.println("1. Tierra");
            System.out.println("2. Acuático");
            System.out.println("3. Aéreo");
            System.out.print("Ingrese opción: ");
            int tipoVehiculo = scanner.nextInt();
            System.out.println();

            VehiculoFactory factory = crearFactory(tipoVehiculo);

            System.out.println("Seleccione la categoría del Vehículo");
            System.out.println("1. Económico");
            System.out.println("2. Lujo");
            System.out.println("3. Usado");
            System.out.print("Ingrese opción: ");
            int categoriaVehiculo = scanner.nextInt();
            System.out.println();

            String categoriaStr = obtenerCategoria(categoriaVehiculo);

            System.out.println("Seleccione el modelo del Vehículo");
            factory.mostrarModelos();
            int modeloVehiculo = scanner.nextInt();

            Vehiculo v = factory.crearVehiculo(modeloVehiculo, categoriaStr);
            vehiculos.add(v);

            System.out.println();
            System.out.println("¿Desea agregar otro vehículo? (si/no)");
            String agregarOtro = scanner.next();
            if (agregarOtro.equalsIgnoreCase("no")) {
                opcion = false;
            }
        }

        System.out.println();
        System.out.println("----- RESUMEN DE COMPRA -----");
        for (Vehiculo v : vehiculos) {
            System.out.println("Vehículo " + (vehiculos.indexOf(v) + 1) + ":");
            v.mostrarInfo();
            System.out.println();
        }

        int subtotal = vehiculos.stream()
                .mapToInt(vehiculo -> vehiculo.precio)
                .sum();

        System.out.printf("Subtotal: $%,d", subtotal);
        System.out.println("\nDescuento aplicado: $" + 0);
        System.out.printf("Total a pagar: $%,d", subtotal);
        System.out.println("\n-----------------------------");
        System.out.println("¡Gracias por su compra en el Reino de los Vehículos!");
        scanner.close();
    }

    public static VehiculoFactory crearFactory(int tipo) {
        switch (tipo) {
            case 1: return new TierraFactory();
            case 2: return new AcuaticoFactory();
            case 3: return new AereoFactory();
            default: return null;
        }
    }

    public static String obtenerCategoria(int categoria) {
        switch (categoria) {
            case 1: return "Económico";
            case 2: return "Lujo";
            case 3: return "Usado";
            default: return "Desconocido";
        }
    }
}
