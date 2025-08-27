package edu.dosw.lab.creacionales.reto3;

import java.util.*;

public class reto3 {

    public List<Vehiculo> vehiculosComprados = new ArrayList<>();

    public void ejecutar(){

        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while(flag){
            System.out.println("Bievenido al Reino de los Vehiculos!");
            System.out.println("Seleccione el tipo de vehiculo");
            System.out.println("1. Tierra");
            System.out.println("2. Acuatico");
            System.out.println("3. Aereo");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.println("Seleccione la categoria de vehiculo");
            System.out.println("1. Economico");
            System.out.println("2. Lujo");
            System.out.println("3. Usado");
            int categoria = sc.nextInt();
            sc.nextLine();

            System.out.println("Seleccione el modelo de vehiculo");
            int modelo = 0;

            if(tipo == 1){
                System.out.println("1. Auto");
                System.out.println("2. Bicicleta");
                System.out.println("3. Moto");
                modelo = sc.nextInt();
                sc.nextLine();
            }

            if(tipo == 2){
                System.out.println("1. Lancha");
                System.out.println("2. Velero");
                System.out.println("3. Jet Ski");
                modelo = sc.nextInt();
                sc.nextLine();
            }

            if(tipo == 3){
                System.out.println("1. Avion");
                System.out.println("2. Avioneta");
                System.out.println("3. Helicoptero");
                modelo = sc.nextInt();
                sc.nextLine();
            }

            VehiculoAbstractFactory factory = null;
            switch(categoria) {
                case 1:
                    factory = new VehiculoEconomicoFactory();
                    break;
                case 2:
                    factory = new VehiculoLujoFactory();
                    break;
                case 3:
                    factory = new VehiculoUsadoFactory();
                    break;
            }

            Vehiculo nuevoVehiculo = factory.crearVehiculo(tipo, modelo);
            vehiculosComprados.add(nuevoVehiculo);

            System.out.println("¿Desea agregar otro vehiculo? (si/no)");
            String seguir = sc.next();
            sc.nextLine();

            if(seguir.equals("si")){
                flag = true;
            }
            else{
                flag = false;

            }
        }

        mostrarResumen();
    }

    public void mostrarResumen(){

        if(vehiculosComprados.isEmpty()){

            System.out.println("No se adquirio nigun vehiculo");
            return;
        }

        System.out.println("----RESUMEN DE COMPRA----");
        
        vehiculosComprados.stream().forEach(System.out::println);

        double total = vehiculosComprados.stream().mapToDouble(Vehiculo::getPrecio).sum();

        System.out.println("Total: $" + total);

    }
}

