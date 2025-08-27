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

            String tipoStr = (tipo == 1) ? "Tierra" : (tipo == 2) ? "Acuático" : "Aéreo";

            if(tipoStr.equals("Tierra")){
                System.out.println("\nSeleccione el modelo de vehículo:");
                System.out.println("1. Auto");
                System.out.println("2. Bicicleta");
                System.out.println("3. Moto");
                System.out.print("Ingrese opción: ");

            } else if(tipoStr.equals("Acuático")){
                System.out.println("\nSeleccione el modelo de vehículo:");
                System.out.println("1. Lancha");
                System.out.print("Ingrese opción: ");

            } else if(tipoStr.equals("Aéreo")){
                System.out.println("\nSeleccione el modelo de vehículo:");
                System.out.println("1. Avioneta");
                System.out.println("2. Helicóptero");
                System.out.print("Ingrese opción: ");
            }
            int modelo = scanner.nextInt();


            String categoriaStr = (categoria == 1) ? Categoria.ECONOMICO : (categoria == 2) ? Categoria.LUJO : Categoria.USADO;
            String modeloStr = (modelo == 1) ? "Auto" : (modelo == 2) ? "Bicicleta" : "Moto";

            Vehiculo v = null;

            if (modelo == 1 && tipoStr.equals("Tierra")) v = new Auto(categoriaStr);
            else if (modelo == 2 && tipoStr.equals("Tierra") ) v = new Bicicleta(categoriaStr);
            else if (modelo == 3) v = new Moto(categoriaStr);
            else if (modelo == 1 && tipoStr.equals("Acuático")) v = new Lancha(categoriaStr);
            else if (modelo == 1 && tipoStr.equals("Aéreo")) v = new Avioneta(categoriaStr);
            else if (modelo == 2) v = new Helicoptero(categoriaStr);

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
