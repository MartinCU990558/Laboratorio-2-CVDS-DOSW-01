package edu.dosw.lab.creacionales.reto3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto3 {
    public static void run(){
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehiculos = new ArrayList<>();

        boolean continuar = true;

        System.out.println("Bienvenido al Reino de los Vehículos!");

        while (continuar) {
            System.out.println("Seleccione el tipo de vehículo:");
            System.out.println("1. Tierra");
            System.out.println("2. Acuatico");
            System.out.println("3. Aereo");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.println("Seleccione la categoría del vehículo:");
            System.out.println("1. Econmico");
            System.out.println("2. Lujo");
            System.out.println("3. Usado");
            int categoria = sc.nextInt();
            sc.nextLine();

            System.out.println("Seleccione el modelo de vehículo:");
            switch (tipo) {
                case 1:
                    System.out.println("1. Auto");
                    System.out.println("2. Bici");
                    System.out.println("3. Moto");
                    break;
                case 2:
                    System.out.println("1. Lancha");
                    System.out.println("2. Barco");
                    System.out.println("3. Submarino");
                    break;
                case 3:
                    System.out.println("1. Avion");
                    System.out.println("2. Avioneta");
                    System.out.println("3. Helicoptero");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            int modelo = sc.nextInt();
            sc.nextLine();

            String tipoStr = switch (tipo) {
                case 1 -> "Tierra";
                case 2 -> "Acuatico";
                case 3 -> "Aereo";
                default -> "";
            };

            String categoriaStr = switch (categoria) {
                case 1 -> "Económico";
                case 2 -> "Lujo";
                case 3 -> "Usado";
                default -> "";
            };

            String modeloStr = "";
            if (tipo == 1) {
                modeloStr = switch (modelo) {
                    case 1 -> "Auto";
                    case 2 -> "Bici";
                    case 3 -> "Moto";
                    default -> "";
                };
            } else if (tipo == 2) {
                modeloStr = switch (modelo) {
                    case 1 -> "Lancha";
                    case 2 -> "Velero";
                    case 3 -> "JetSki";
                    default -> "";
                };
            } else if (tipo == 3) {
                modeloStr = switch (modelo) {
                    case 1 -> "Avion";
                    case 2 -> "Avioneta";
                    case 3 -> "Helicoptero";
                    default -> "";
                };
            }

            AbstractVehicleFactory factory = FactoryProducer.getFactory(tipoStr);
            Vehicle v = factory.create(modeloStr, categoriaStr);
            if (v != null) {
                vehiculos.add(v);
                System.out.println("Vehículo creado: " + v);
            } else {
                System.out.println("No se pudo crear el vehículo.");
            }

            System.out.print("¿Desea agregar otro vehículo? (si/no): ");
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

        System.out.println("---- RESUMEN DE COMPRA ----");

        int index = 1;
        double subtotal = 0;
        for (Vehicle v : vehiculos) {
            System.out.println("Vehículo " + index + ":");
            System.out.println("Tipo: " + v.getTipo());
            System.out.println("Categoría: " + v.getCategoria());
            System.out.println("Velocidad máxima: " + v.getVelMaxima() + " km/h");
            System.out.println("Precio: $" + v.getPrecio());
            System.out.println("Equipamiento: " + v.getEquipamento());
            System.out.println();
            subtotal += v.getPrecio();
            index++;
        }

        double descuento = 0;
        double total = subtotal - descuento;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + total);
        System.out.println("----------------------------");
        System.out.println("¡Gracias por su compra en el Reino de los Vehículos!");

        sc.close();
    }
}


