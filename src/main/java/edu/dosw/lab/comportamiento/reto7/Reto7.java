package edu.dosw.lab.comportamiento.reto7;

import java.util.Scanner;

public class Reto7 {

    public static void ejecutar() {
        System.out.println("\n=== EJECUTANDO RETO 7 - CONTROL REMOTO MÁGICO ===");

        Scanner scanner = new Scanner(System.in);
        ControlRemoto control = new ControlRemoto();

        System.out.print("Número de acciones a registrar: ");
        int numAcciones = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numAcciones; i++) {
            System.out.println("\nAcción " + (i + 1) + ":");

            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Seleccione: 1. Encender luz 2. Abrir puerta 3. Reproducir música 4. Ajustar volumen ");
            int opcion = Integer.parseInt(scanner.nextLine());

            Command comando = null;

            switch (opcion) {
                case 1:
                    comando = new EncenderLuzCommand(usuario);
                    break;
                case 2:
                    comando = new AbrirPuertaCommand(usuario);
                    break;
                case 3:
                    comando = new ReproducirMusicaCommand(usuario);
                    break;
                case 4:
                    System.out.print("Ingrese valor (0-100): ");
                    int valor = Integer.parseInt(scanner.nextLine());
                    comando = new AjustarVolumenCommand(usuario, valor);
                    break;
                default:
                    System.out.println("Opción no válida");
                    i--;
                    continue;
            }

            String resultado = control.ejecutarAccion(comando);
            System.out.println(resultado);

            System.out.print("Deshacer acción? (si/no): ");
            String deshacer = scanner.nextLine();

            if (deshacer.equalsIgnoreCase("si")) {
                String resultadoDeshacer = control.deshacerAccion(i);
                System.out.println(resultadoDeshacer);
            }
        }


        control.mostrarHistorial();
        control.mostrarResumen();

        scanner.close();
    }


    public static void main(String[] args) {
        ejecutar();
    }
}