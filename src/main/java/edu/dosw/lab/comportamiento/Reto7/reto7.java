package edu.dosw.lab.comportamiento.Reto7;
import java.util.*;
import java.util.function.Function;
public class reto7 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Control control = new Control();

        Map<Integer, Function<String, Command>> comandos = new HashMap<>();
        comandos.put(1, EncenderLuzCommand::new);
        comandos.put(2, AbrirPuertaCommand::new);
        comandos.put(3, ReproducirMusicaCommand::new);

        System.out.print("Número de acciones a registrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nAcción " + i + ":");
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Seleccione: 1. Encender luz 2. Abrir puerta 3. Reproducir música 4. Ajustar volumen ");
            int opcion = sc.nextInt();
            sc.nextLine();

            Command accion = null;
            if (opcion == 4) {
                System.out.print("Ingrese valor (0–100): ");
                int val = sc.nextInt();
                sc.nextLine();
                accion = new AjustarVolumenCommand(usuario, val);
            } else {

                accion = comandos.get(opcion).apply(usuario);
            }

            System.out.print("Deshacer acción? (si/no): ");
            String des = sc.nextLine().trim().toLowerCase();
            boolean deshacer = des.equals("si");

            control.ejecutarAccion(accion, deshacer);
        }

        control.mostrarHistorial();
        control.mostrarResumen();
    }
}
