package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto7;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;


public class Reto7MagicRemote {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        Light light = new Light();
        Door door = new Door();
        Music music = new Music();
        Volume volume = new Volume();

        System.out.print("Número de acciones a registrar: ");
        int n;
        try {
            n = Integer.parseInt(scanner.nextLine().trim());
            if (n <= 0) n = 0;
        } catch (Exception ex) {
            n = 0;
        }

        List<HistoricActions> records = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nAcción " + i + ":");
            System.out.print("Usuario: ");
            String user = scanner.nextLine().trim();
            if (user.isEmpty()) user = "Usuario-desconocido";

            System.out.println("Seleccione: 1. Encender luz 2. Abrir puerta 3. Reproducir música 4. Ajustar volumen");
            int option;
            try {
                option = Integer.parseInt(scanner.nextLine().trim());
            } catch (Exception ex) {
                option = -1;
            }

            Command cmd;
            switch (option) {
                case 1:
                    cmd = new TurnOnLightCommand(light);
                    break;
                case 2:
                    cmd = new OpenDoorCommand(door);
                    break;
                case 3:
                    cmd = new PlayMusicCommand(music);
                    break;
                case 4:
                    System.out.print("Ingrese valor (0-100): ");
                    int val;
                    try {
                        val = Integer.parseInt(scanner.nextLine().trim());
                    } catch (Exception ex) {
                        val = 0;
                    }
                    cmd = new AdjustVolumeCommand(volume, val);
                    break;
                default:
                    cmd = new InvalidCommand();
                    break;
            }

            System.out.print("Deshacer acción? (si/no): ");
            boolean undoRequested = scanner.nextLine().trim().equalsIgnoreCase("si");
            records.add(new HistoricActions(cmd, user, undoRequested));
        }

        System.out.println();
        for (int i = 0; i < records.size(); i++) {
            HistoricActions ha = records.get(i);
            int idx = i + 1;
            System.out.println("Acción " + idx + " ejecutada por " + ha.user + ": " + ha.command.execute());
            if (ha.undoRequested) {
                System.out.println("Acción " + idx + " deshecha: " + ha.command.undo());
                ha.wasUndone = true;
            }
            System.out.println();
        }

        System.out.println("\n--- Historial completo ---");
        for (int i = 0; i < records.size(); i++) {
            HistoricActions ha = records.get(i);
            String line = (i + 1) + ": " + ha.command.getDescription() + " - Usuario: " +ha.user;
            if (ha.wasUndone) line += " (deshecha)";
            System.out.println(line);
        }

        Map<String, Integer> counts = new LinkedHashMap<>();
        Set<String> users = new LinkedHashSet<>();
        for (HistoricActions ha : records) users.add(ha.user);

        for (HistoricActions ha : records) {
            String desc = ha.command.getDescription();
            if (!"Acción inválida".equals(desc)) {
                counts.put(ha.user, counts.getOrDefault(ha.user, 0) + 1);
            }
        }

        System.out.println("\n--- Investigando quién desconfiguró los electrodomésticos ---");
        for (String user : users) {
            int cnt = counts.getOrDefault(user, 0);
            if (cnt == 0) {
                System.out.println(user + " realizó 0 acciones que alteraron la configuración.");
            } else if (cnt == 1) {
                System.out.println(user + " realizó 1 acción.");
            } else {
                System.out.println("Se detecta que " + user + " realizó " + cnt + " acciones que alteraron la configuración.");
            }
        }
    }
}
