package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.FactoryMethod.Reto3;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Reto3 {

    public static void run() {
        Scanner sc = new Scanner(System.in);
        List<Vehiculo> carrito = new ArrayList<>();
        NumberFormat moneda = NumberFormat.getCurrencyInstance(new Locale("es","CO"));

        System.out.println("Bienvenido al Reino de los Vehículos!");

        boolean seguir = true;
        while (seguir) {
            
            System.out.println("Seleccione el tipo de vehículo:");
            System.out.println("1. Tierra\n2. Acuático\n3. Aéreo");
            int tipoOpt = leerOpcion(sc, 1, 3);

            
            VehiculoFactory.Tipo tipo = (tipoOpt == 1)
                    ? VehiculoFactory.Tipo.TIERRA
                    : (tipoOpt == 2 ? VehiculoFactory.Tipo.ACUATICO : VehiculoFactory.Tipo.AEREO);

            
            System.out.println("\nSeleccione la categoría del vehículo:");
            System.out.println("1. Económico\n2. Lujo\n3. Usado");
            int catOpt = leerOpcion(sc, 1, 3);

            List<String> modelos = VehiculoFactory.modelosPorTipo(tipo);
            System.out.println("\nSeleccione el modelo de vehículo:");
            for (int i = 0; i < modelos.size(); i++) {
                System.out.println((i + 1) + ". " + modelos.get(i));
            }
            int modeloOpt = leerOpcion(sc, 1, modelos.size());
            String modeloSel = modelos.get(modeloOpt - 1);


            Vehiculo v = VehiculoFactory.crearPorModelo(modeloSel);
            switch (catOpt) {
                case 1: v = new VehiculoEconomico(v); break;
                case 2: v = new VehiculoLujo(v); break;
                case 3: v = new VehiculoUsado(v); break;
            }

            carrito.add(v);

            System.out.print("\n¿Desea agregar otro vehículo? (si/no): ");
            seguir = sc.next().trim().equalsIgnoreCase("si");
            System.out.println();
        }

        System.out.println("---- RESUMEN DE COMPRA ---\n");
        IntStream.range(0, carrito.size()).forEach(i -> {
            Vehiculo v = carrito.get(i);
            System.out.println("Vehículo " + (i + 1) + ":");
            System.out.println("Tipo: " + v.getNombre());
            System.out.println("Categoría: " + v.getCategoria());
            System.out.println("Velocidad máxima: " + (int)v.getVelocidadMaxima() + " km/h");
            System.out.println("Precio: " + moneda.format(v.getPrecio()));
            System.out.println("Equipamiento: " + v.getEquipamiento());
            System.out.println();
        });

        double subtotal = carrito.stream().mapToDouble(Vehiculo::getPrecio).sum();
        double descuento = 0; 
        double total = subtotal - descuento;

        System.out.println("Subtotal: " + moneda.format(subtotal));
        System.out.println("Descuento aplicado: " + moneda.format(descuento));
        System.out.println("Total a pagar: " + moneda.format(total));
        System.out.println("------------------------\n¡Gracias por su compra en el Reino de los Vehículos!");
    }

    private static int leerOpcion(Scanner sc, int min, int max) {
        int opt;
        while (true) {
            System.out.print("Ingrese opción: ");
            while (!sc.hasNextInt()) { System.out.print("Número inválido. Intente: "); sc.next(); }
            opt = sc.nextInt();
            if (opt >= min && opt <= max) break;
            System.out.println("Opción fuera de rango (" + min + "-" + max + ").");
        }
        return opt;
    }
}
