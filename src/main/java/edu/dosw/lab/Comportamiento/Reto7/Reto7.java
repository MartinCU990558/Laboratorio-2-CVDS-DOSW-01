package edu.dosw.lab.Comportamiento.Reto7;

import java.util.Scanner;

public class Reto7 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        ControlRemoto control = new ControlRemoto();


        Luz luz = new Luz();
        Puerta puerta = new Puerta();
        Musica musica = new Musica();
        Volumen volumen = new Volumen();

        System.out.print("Número de acciones a registrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nAcción " + i + ":");
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            System.out.println("Seleccione: 1. Encender luz 2. Abrir puerta 3. Reproducir música 4. Ajustar volumen");
            int opcion = sc.nextInt();
            sc.nextLine();

            Command cmd = null;
            if (opcion == 1) cmd = new EnLuz(luz, usuario);
            if (opcion == 2) cmd = new OPuerta(puerta, usuario);
            if (opcion == 3) cmd = new RMusica(musica, usuario);
            if (opcion == 4) {
                System.out.print("Ingrese valor (0-100): ");
                int valor = sc.nextInt();
                sc.nextLine();
                cmd = new AVolumen(volumen, valor, usuario);
            }

            System.out.print("Deshacer acción? (si/no): ");
            boolean deshacer = sc.nextLine().equalsIgnoreCase("si");

            control.ejecutarAccion(cmd, deshacer);
        }

        control.mostrarHistorial();
        control.investigar();
    }
}