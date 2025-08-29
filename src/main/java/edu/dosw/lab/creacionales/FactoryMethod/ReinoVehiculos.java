package edu.dosw.lab.creacionales.FactoryMethod;
import java.util.ArrayList;
import java.util.Scanner;

public class ReinoVehiculos {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        boolean opcion = true;
        Scanner scanner = new Scanner(System.in);

        while (opcion) {
            System.out.println("Bienvenido al Reino de los Vehículos");
            System.out.println("Seleccione el tipo de Vehículo");
            System.out.println("1. Tierra");
            System.out.println("2. Acuático");
            System.out.println("3. Aéreo");
            System.out.println("Ingrese opción: ");
            int tipoVehiculo = scanner.nextInt();
            System.out.println();

        }
    }
}