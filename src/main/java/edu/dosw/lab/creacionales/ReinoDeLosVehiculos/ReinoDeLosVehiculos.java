package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;

import java.util.*;

public class ReinoDeLosVehiculos {

    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bienvenido al Reino de los Vehículos!");

        while (continuar) {
            System.out.println("Seleccione el tipo de vehículo:");
            System.out.println("1. Tierra");
            System.out.println("2. Acuático");
            System.out.println("3. Aéreo");
            System.out.print("Ingrese opción: ");
            int tipo = scanner.nextInt();

            System.out.println("\nSeleccione la categoría del vehículo:");
            System.out.println("1. Económico");
            System.out.println("2. Lujo");
            System.out.println("3. Usado");
            System.out.print("Ingrese opción: ");
            int categoria = scanner.nextInt();

            System.out.println("\nSeleccione el modelo de vehículo:");
            System.out.println("1. Auto");
            System.out.println("2. Bicicleta");
            System.out.println("3. Moto");
            System.out.print("Ingrese opción: ");
            int modelo = scanner.nextInt();

            String tipoStr = (tipo == 1) ? "Tierra" : (tipo == 2) ? "Acuático" : "Aéreo";
            String categoriaStr = (categoria == 1) ? "Económico" : (categoria == 2) ? "Lujo" : "Usado";
            String modeloStr = (modelo == 1) ? "Auto" : (modelo == 2) ? "Bicicleta" : "Moto";

            Vehiculo v = null;

            if (modelo == 1) v = new Auto(tipoStr);
            else if (modelo == 2) v = new Avioneta(tipoStr);
            //else if (modelo == 3) v = new Moto(tipoStr, categoriaStr, precio);

            vehiculos.add(v);

            System.out.println("\n🚗 Vehículo creado: " + tipoStr + " - " + categoriaStr + " - " + modeloStr);

            System.out.print("\n¿Desea agregar otro vehículo? (si/no): ");
            String respuesta = scanner.next();

            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

        ComprarVehiculo compra = new ComprarVehiculo();
        compra.imprimirResumen(vehiculos);
    }

}
