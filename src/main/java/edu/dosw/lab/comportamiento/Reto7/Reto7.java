package edu.dosw.lab.comportamiento.Reto7;

import java.util.Scanner;


public class Reto7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Luz luzSala = new Luz("Luz de la Sala");
        Puerta puertaPrincipal = new Puerta("Puerta Principal");
        ReproductorMusica sistemaMusica = new ReproductorMusica("Sistema de Música");
        ControlRemoto controlRemoto = new ControlRemoto();
        System.out.println("=== CONTROL REMOTO MÁGICO ===");
        System.out.println("Número de acciones a registrar: \n");
        int numAcciones = scanner.nextInt();
        for (int i = 1; i <= numAcciones; i++) {
            System.out.println("**Acción " + i + ":**");
            
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            
            System.out.println("Seleccione: 1. Encender luz 2. Abrir puerta 3. Reproducir música 4. Ajustar volumen");
            System.out.print("Opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());
            
            Comando comando = null;
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese valor de brillo (0-100): ");
                    int brillo = Integer.parseInt(scanner.nextLine());
                    comando = new ComandoLuz(luzSala, "encender", usuario, brillo);
                    break;
                    
                case 2:
                    comando = new ComandoPuerta(puertaPrincipal, "abrir", usuario);
                    break;
                case 3:
                    comando = new ComandoMusica(sistemaMusica, "reproducir", usuario);
                    break;
                case 4:
                    System.out.print("Ingrese valor de volumen (0-100): ");
                    int volumen = Integer.parseInt(scanner.nextLine());
                    comando = new ComandoVolumen(sistemaMusica, usuario, volumen);
                    break;
                default:
                    System.out.println("Opción inválida");
                    i--; 
                    continue;
            }
            controlRemoto.ejecutarComando(comando);
            System.out.print("Deshacer acción? (si/no): ");
            String deshacer = scanner.nextLine();
            if (deshacer.equalsIgnoreCase("si")) {
                controlRemoto.deshacerUltimoComando();
            }
            System.out.println();
        }
        System.out.println("--Historial completo --");
        for (int i = 0; i < controlRemoto.getAccionesEjecutadas().size(); i++) {
            Comando cmd = controlRemoto.getAccionesEjecutadas().get(i);
            String estado = controlRemoto.getAccionesDeshechas().contains(cmd) ? " (deshecha)" : "";
            String descripcion = "";
            if (cmd.getDescripcion().contains("Ajustar volumen")) {
                descripcion = "Ajustar volumen a " + cmd.getDescripcion().replace("Ajustar volumen a ", "");
            } else if (cmd.getDescripcion().equals("Encender luz")) {
                descripcion = "Encender luz";
            } else if (cmd.getDescripcion().equals("Abrir puerta")) {
                descripcion = "Abrir puerta";
            } else if (cmd.getDescripcion().equals("Reproducir música")) {
                descripcion = "Reproducir música";
            }
            
            System.out.println((i + 1) + ": " + descripcion + " - Usuario: " + cmd.getUsuario() + estado);
        }
        System.out.println("\n-- Investigando quién desconfiguró los electrodomésticos --");
        java.util.Map<String, Integer> accionesEfectivas = new java.util.HashMap<>();
        for (Comando cmd : controlRemoto.getAccionesEjecutadas()) {
            if (!controlRemoto.getAccionesDeshechas().contains(cmd)) {
                String usuario = cmd.getUsuario();
                accionesEfectivas.put(usuario, accionesEfectivas.getOrDefault(usuario, 0) + 1);
            }
        }
        for (String usuario : accionesEfectivas.keySet()) {
            int count = accionesEfectivas.get(usuario);
            System.out.println("Se detecta que " + usuario + 
                             " realizó " + count + 
                             (count == 1 ? " acción que alteró la configuración." : 
                                          " acciones que alteraron la configuración."));
        }
        scanner.close();
    }
}