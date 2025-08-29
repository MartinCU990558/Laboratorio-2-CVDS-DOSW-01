package edu.dosw.lab.creacionales.Reto3AbstractFactory;

import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Reto3ReinoDeVehiculos {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Vehiculo> seleccionados = new ArrayList<>();
        NumberFormat formato = NumberFormat.getInstance(new Locale("es", "CO"));

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione el tipo de vehículo:");
            System.out.println("1. Tierra");
            System.out.println("2. Agua");
            System.out.println("3. Aire");
            int opcionTipo = sc.nextInt();
            String tipoVehiculo = "";
            switch (opcionTipo) {
                case 1:
                    System.out.println("Seleccione vehículo: 1. Auto, 2. Moto, 3. Bicicleta");
                    int opTierra = sc.nextInt();
                    tipoVehiculo = (opTierra == 1) ? "Auto" : (opTierra == 2) ? "Moto" : "Bicicleta";
                    break;
                case 2:
                    System.out.println("Seleccione vehículo: 1. JetSki, 2. Lancha, 3. Velero");
                    int opAgua = sc.nextInt();
                    tipoVehiculo = (opAgua == 1) ? "JetSki" : (opAgua == 2) ? "Lancha" : "Velero";
                    break;
                case 3:
                    System.out.println("Seleccione vehículo: 1. Avion, 2. Avioneta, 3. Helicoptero");
                    int opAire = sc.nextInt();
                    tipoVehiculo = (opAire == 1) ? "Avion" : (opAire == 2) ? "Avioneta" : "Helicoptero";
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continue;
            }
            System.out.println("Seleccione la categoría: 1. ECONOMICO, 2. LUJO, 3. USADO");
            int opcionCategoria = sc.nextInt();
            Categoria categoria = (opcionCategoria == 1) ? Categoria.ECONOMICO
                    : (opcionCategoria == 2) ? Categoria.LUJO : Categoria.USADO;

            Vehiculo vehiculo = VehiculoFactory.crearVehiculo(tipoVehiculo, categoria);
            seleccionados.add(vehiculo);
            System.out.println("\nVehículo añadido:");
            System.out.println(vehiculo.getTipo() + " (" + vehiculo.getCategoria() + ")");
            System.out.println("Velocidad Máx: " + vehiculo.getVelocidadMax());
            System.out.println("Precio: " + formato.format(vehiculo.getPrecio()));
            System.out.println("Equipamiento: " + vehiculo.getEquipamentoEspecial());
            System.out.println("\n¿Desea añadir otro vehículo? (s/n)");
            continuar = sc.next().equalsIgnoreCase("s");
        }
        double total = seleccionados.stream()
                .collect(Collectors.summingDouble(Vehiculo::getPrecio));
        System.out.println("\n========== FACTURA ==========");
        seleccionados.forEach(v -> {
            System.out.println(v.getTipo() + " - " + v.getCategoria() +
                    " -> " + formato.format(v.getPrecio()));
        });
        System.out.println("------------------------------");
        System.out.println("Total a pagar: " + formato.format(total));
    }
}
