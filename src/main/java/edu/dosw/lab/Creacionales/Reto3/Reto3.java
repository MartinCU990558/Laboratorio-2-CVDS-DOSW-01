package edu.dosw.lab.Creacionales.Reto3;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Reto3 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        List<Vehiculo> vehiculosComprados = new ArrayList<>();
        boolean continuar = true;

        NumberFormat formatoCOP = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        System.out.println("Bienvenido al Reino de los Vehículos!");

        while (continuar) {
            System.out.println("\nSeleccione el tipo de vehículo:");
            System.out.println("1. Tierra");
            System.out.println("2. Acuático");
            System.out.println("3. Aéreo");
            int tipoOpcion = sc.nextInt();

            String tipo = "";
            switch (tipoOpcion) {
                case 1: tipo = "tierra"; break;
                case 2: tipo = "acuatico"; break;
                case 3: tipo = "aereo"; break;
                default: continue;
            }

            System.out.println("\nSeleccione la categoría del vehículo:");
            System.out.println("1. Económico");
            System.out.println("2. Lujo");
            System.out.println("3. Usado");
            int catOpcion = sc.nextInt();

            String categoria = "";
            switch (catOpcion) {
                case 1: categoria = "Económico"; break;
                case 2: categoria = "Lujo"; break;
                case 3: categoria = "Usado"; break;
            }

            String modelo = "";
            switch (tipo) {
                case "tierra":
                    System.out.println("\nSeleccione el modelo de vehículo:");
                    System.out.println("1. Auto");
                    System.out.println("2. Bicicleta");
                    System.out.println("3. Moto");
                    int tierraOp = sc.nextInt();
                    modelo = (tierraOp == 1) ? "auto" : (tierraOp == 2) ? "bicicleta" : "moto";
                    break;

                case "acuatico":
                    System.out.println("\nSeleccione el modelo de vehículo:");
                    System.out.println("1. Lancha");
                    System.out.println("2. Velero");
                    System.out.println("3. JetSki");
                    int aguaOp = sc.nextInt();
                    modelo = (aguaOp == 1) ? "lancha" : (aguaOp == 2) ? "velero" : "jetski";
                    break;

                case "aereo":
                    System.out.println("\nSeleccione el modelo de vehículo:");
                    System.out.println("1. Avión");
                    System.out.println("2. Avioneta");
                    System.out.println("3. Helicóptero");
                    int aireOp = sc.nextInt();
                    modelo = (aireOp == 1) ? "avion" : (aireOp == 2) ? "avioneta" : "helicoptero";
                    break;
            }

            double precio = (categoria.equals("Lujo")) ? 50_000_000 :
                    (categoria.equals("Económico")) ? 150_000_000 : 30_000_000;

            double velocidad = (modelo.equals("auto")) ? 180 :
                    (modelo.equals("avioneta")) ? 250 :
                            (modelo.equals("moto")) ? 120 : 100;

            String comodidad = (categoria.equals("Lujo")) ? "Alta" : "Básica";
            String equipamiento = (categoria.equals("Lujo")) ? "Aire acondicionado + GPS" :
                    (categoria.equals("Económico")) ? "Instrumentos básicos de vuelo" :
                            "Sin extras";

            Vehiculo vehiculo = VehiculoFactory.createVehiculo(modelo, categoria, equipamiento, comodidad, precio, velocidad);
            vehiculosComprados.add(vehiculo);

            System.out.print("\n¿Desea agregar otro vehículo? (si/no): ");
            String respuesta = sc.next();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

        System.out.println("\n---- RESUMEN DE COMPRA ---");
        double subtotal = 0;
        int contador = 1;
        for (Vehiculo v : vehiculosComprados) {
            System.out.println("\nVehículo " + contador++ + ":");
            v.mostrarInfo();
            subtotal += v.getPrecio();
        }

        double descuento = 0;
        double total = subtotal - descuento;

        System.out.println("Subtotal: " + formatoCOP.format(subtotal));
        System.out.println("Descuento aplicado: " + formatoCOP.format(descuento));
        System.out.println("Total a pagar: " + formatoCOP.format(total));
        System.out.println("\n¡Gracias por su compra en el Reino de los Vehículos!");
    }
}
