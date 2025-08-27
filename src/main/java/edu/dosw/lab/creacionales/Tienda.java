package edu.dosw.lab.creacionales;

import edu.dosw.lab.creacionales.Fabricas.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Tienda {


    public Tienda(){
    }


    private void factura(ArrayList<Vehiculo> v){
        System.out.println("-----Resumen------");
        IntStream.range(0, v.size()).forEach(i -> {
            Vehiculo vi = v.get(i);
            System.out.println("Vehiculo #" + (i + 1) + ":");
            System.out.println("Clase y categoria: " + vi.getClass().getSimpleName());
            System.out.println("Velocidad max: " + vi.getVelocidadMax());
            System.out.println("Descripcion: " + vi.getDescripcion());
            System.out.println("Precio: " + vi.getPrecio());
        });
        System.out.println("-----Total------");
        Double t =v.stream().mapToDouble(Vehiculo::getPrecio).sum();
        System.out.println("Precio total: $" + t);

    }


    public ArrayList<Vehiculo> venta() {
        ArrayList<Vehiculo> vehiculosComprad = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean seguirComprando = true;

        System.out.println("Bienvenido al Reino de los vehiculos: ");

        while (seguirComprando) {
            System.out.print("\nIngrese el número de tipo de vehiculo: \n");
            System.out.println("1. Tierra");
            System.out.println("2. Agua");
            System.out.println("3. Aire");
            System.out.print("Ingrese una opcion: ");
            String tipoOpcion = scanner.nextLine();

            String tipoTransporte;
            switch (tipoOpcion) {
                case "1":
                    tipoTransporte = "Tierra";
                    break;
                case "2":
                    tipoTransporte = "Agua";
                    break;
                case "3":
                    tipoTransporte = "Aire";
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    continue;
            }

            System.out.println("\nSeleccione la categoria:");
            System.out.println("1. Económico");
            System.out.println("2. Lujo");
            System.out.println("3. Usado");
            System.out.print("Ingrese una opcion: ");
            String categoriaOpcion = scanner.nextLine();

            String categoria;
            switch (categoriaOpcion) {
                case "1":
                    categoria = "Economico";
                    break;
                case "2":
                    categoria = "Lujo";
                    break;
                case "3":
                    categoria = "Usado";
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    continue;
            }

            String[] vehiculosDisponibles;
            switch (tipoTransporte) {
                case "Tierra":
                    vehiculosDisponibles = new String[]{"Auto", "Moto", "Bicicleta"};
                    break;
                case "Agua":
                    vehiculosDisponibles = new String[]{"Lancha", "Velero", "JetSki"};
                    break;
                case "Aire":
                    vehiculosDisponibles = new String[]{"Avion", "Avioneta", "Helicoptero"};
                    break;
                default:
                    vehiculosDisponibles = new String[0];
            }

            System.out.println("\nVehículos disponibles en :");
            for (int i = 0; i < vehiculosDisponibles.length; i++) {
                System.out.println((i + 1) + ". " + vehiculosDisponibles[i]);
            }
            System.out.print("Seleccione el número de vehículo: ");
            String vehiculoOpcion = scanner.nextLine();

            int vehiculoIndex = Integer.parseInt(vehiculoOpcion) - 1;
            if (vehiculoIndex < 0 || vehiculoIndex >= vehiculosDisponibles.length) {
                System.out.println("Opcion invalida.");
                continue;
            }

            String vehiculoSeleccionado = vehiculosDisponibles[vehiculoIndex];

            VehiculoFactory factory;
            switch (categoria) {
                case "Economico":
                    factory = new EconomicaFactory();
                    break;
                case "Lujo":
                    factory = new LujoFactory();
                    break;
                case "Usado":
                    factory = new UsadoFactory();
                    break;
                default:
                    System.out.println("Categori invalida.");
                    continue;
            }

            Vehiculo vehiculo = switch (vehiculoSeleccionado) {
                case "Auto" -> factory.crearCarro();
                case "Moto" -> factory.crearMoto();
                case "Bicicleta" -> factory.crearBicicleta();
                default -> null;
            };

            if (vehiculo != null) {
                vehiculosComprad.add(vehiculo);
                System.out.println("Vehiculo añadido exitosamente.");
            } else {
                System.out.println("Vehiculo inválido.");
            }

            System.out.print("\nDesea añadir otro vehículo? (s/n): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            seguirComprando = respuesta.equals("s");
        }

        return vehiculosComprad;
    }




    public static void ejecutar () {
            Tienda t = new Tienda();
            t.factura(t.venta());
    }


    public static void main (String[]args){
            Tienda.ejecutar();
    }


}
