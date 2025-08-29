package edu.dosw.lab.comportamiento.Comand.reto7;

import java.util.*;

class ControlRemotoMagico {
    private List<Comando> historial;
    private List<Comando> comandosEjecutados;

    public ControlRemotoMagico() {
        this.historial = new ArrayList<>();
        this.comandosEjecutados = new ArrayList<>();
    }

    public void ejecutarComando(Comando comando) {
        comando.ejecutar();
        historial.add(comando);
        comandosEjecutados.add(comando);
        System.out.println("Acción " + historial.size() + " ejecutada por " + comando.getUsuario() + ": " + comando.getDescripcion());
    }

    public void deshacerComando(int indice) {
        if (indice > 0 && indice <= historial.size()) {
            Comando comando = historial.get(indice - 1);
            comando.deshacer();
            System.out.println("Acción " + indice + " deshecha: " + comando.getDescripcion());
        } else {
            System.out.println("Índice de acción inválido");
        }
    }

    public void mostrarHistorialCompleto() {
        System.out.println("\n--- Historial completo ---");
        for (int i = 0; i < historial.size(); i++) {
            Comando cmd = historial.get(i);
            System.out.println((i + 1) + ": " + cmd.getDescripcion() + " - Usuario: " + cmd.getUsuario() + " (deshecha)");
        }
    }

    public void investigarDesconfigurador() {
        System.out.println("\n--- Investigando quién desconfiguró los electrodomésticos ---");

        Map<String, Integer> conteoAcciones = new HashMap<>();
        for (Comando cmd : historial) {
            conteoAcciones.put(cmd.getUsuario(), conteoAcciones.getOrDefault(cmd.getUsuario(), 0) + 1);
        }

        String posibleDesconfigurador = "";
        int maxAcciones = 0;

        for (Map.Entry<String, Integer> entry : conteoAcciones.entrySet()) {
            System.out.println(entry.getKey() + " realizó " + entry.getValue() + " accion(es).");
            if (entry.getValue() > maxAcciones) {
                maxAcciones = entry.getValue();
                posibleDesconfigurador = entry.getKey();
            }
        }

        if (maxAcciones >= 2) {
            System.out.println("Se detecta que " + posibleDesconfigurador + " realizó " + maxAcciones + " acciones que alteraron la configuración.");
        }
    }

    public void registrarAcciones(int numAcciones, Scanner scanner) {
        System.out.println("\nNúmero de acciones a registrar: " + numAcciones + "\n");

        // Crear dispositivos
        DispositivoVolumen volumen = new DispositivoVolumen();
        DispositivoPuerta puerta = new DispositivoPuerta();
        DispositivoMusica musica = new DispositivoMusica();
        DispositivoLuz luz = new DispositivoLuz();

        for (int i = 1; i <= numAcciones; i++) {
            System.out.println("Acción " + i + ":");
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();

            System.out.println("Selecciones: 1. Encender luz 2. Abrir puerta 3. Reproducir música 4. Ajustar volumen");
            System.out.print("Seleccione: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            Comando comando = null;

            switch (opcion) {
                case 1:
                    comando = new ComandoEncenderLuz(luz, usuario);
                    break;
                case 2:
                    comando = new ComandoAbrirPuerta(puerta, usuario);
                    break;
                case 3:
                    comando = new ComandoReproducirMusica(musica, usuario);
                    break;
                case 4:
                    System.out.print("Ingrese valor (0-100): ");
                    int valorVolumen = Integer.parseInt(scanner.nextLine());
                    comando = new ComandoAjustarVolumen(volumen, usuario, valorVolumen);
                    break;
            }

            if (comando != null) {
                System.out.print("Deshacer acción? (si/no): ");
                String deshacer = scanner.nextLine();

                ejecutarComando(comando);

                if (deshacer.equalsIgnoreCase("si")) {
                    deshacerComando(historial.size());
                }
            }

            System.out.println();
        }
    }
}