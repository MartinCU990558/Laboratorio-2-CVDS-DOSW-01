package edu.dosw.lab.comportamiento.ControlRemotoMagicoReto7;

import java.util.Scanner;

public class ControlRemotoMagico {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        ControlRemoto control = new ControlRemoto();

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

            Accion accion = null;
            if (opcion == 1) accion = new AccionEncenderLuz(usuario);
            else if (opcion == 2) accion = new AccionAbrirPuerta(usuario);
            else if (opcion == 3) accion = new AccionReproducirMusica(usuario);
            else if (opcion == 4) {
                System.out.print("Ingrese valor (0-100): ");
                int vol = sc.nextInt();
                sc.nextLine();
                accion = new AccionAjustarVolumen(usuario, vol);
            }

            System.out.print("Deshacer acción? (si/no): ");
            String resp = sc.nextLine();
            boolean deshacer = resp.equalsIgnoreCase("si");

            control.ejecutarAccion(accion, deshacer);
        }

        control.mostrarHistorial();
        control.resumenUsuarios();
    }
}
