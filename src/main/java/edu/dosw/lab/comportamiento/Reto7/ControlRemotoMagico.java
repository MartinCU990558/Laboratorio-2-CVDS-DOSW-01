package edu.dosw.lab.comportamiento.Reto7;
import java.util.*;

public class ControlRemotoMagico {
    private List<Command> historialComandos;
    private List<Integer> comandosDeshechos;
    
    public ControlRemotoMagico() {
        historialComandos = new ArrayList<>();
        comandosDeshechos = new ArrayList<>();
    }
    
    public void ejecutarComando(Command comando) {
        comando.execute();
        historialComandos.add(comando);
    }
    
    public void deshacerComando(int indice) {
        if (indice >= 0 && indice < historialComandos.size()) {
            Command comando = historialComandos.get(indice);
            comando.undo();
            comandosDeshechos.add(indice);
        } else {
            System.out.println("Índice inválido para deshacer acción");
        }
    }
    
    public void mostrarHistorial() {
        System.out.println("\n--- Historial completo ---");
        for (int i = 0; i < historialComandos.size(); i++) {
            Command comando = historialComandos.get(i);
            String usuario = comando.getUser();
            String descripcion = comando.getDescription();
            String deshecharMarca = comandosDeshechos.contains(i) ? " (deshecha)" : "";
            System.out.println((i + 1) + ": " + descripcion + " - Usuario: " + usuario + deshecharMarca);
        }
    }
    
    public void mostrarResumen() {
    System.out.println("\n--- Investigando quién desconfiguró los electrodomésticos ---");
    Map<String, Integer> accionesTotalesPorUsuario = new HashMap<>();
    
    for (Command comando : historialComandos) {
        String usuario = comando.getUser();
        accionesTotalesPorUsuario.put(usuario, accionesTotalesPorUsuario.getOrDefault(usuario, 0) + 1);
    }
    for (String usuario : accionesTotalesPorUsuario.keySet()) {
        int total = accionesTotalesPorUsuario.get(usuario);
        int activas = 0;
        for (int i = 0; i < historialComandos.size(); i++) {
            if (!comandosDeshechos.contains(i) && historialComandos.get(i).getUser().equals(usuario)) {
                activas++;
            }
        }

        if (activas > 0) {
            if (activas > 1) {
                System.out.println("Se detecta que " + usuario + " realizó " + activas + " acciones que alteraron la configuración.");
            } else {
                System.out.println(usuario + " realizó " + activas + " acción.");
            }
        }
        else if (total >= 2) {
            System.out.println("Se detecta que " + usuario + " realizó " + total + " acciones que alteraron la configuración.");
        }
    }
}
  
    public void ejecutar() {
        Lights lights = new Lights();
        Doors doors = new Doors();
        Music music = new Music();
        Volume volume = new Volume();
        Blinds blinds = new Blinds();
        volume.setLevel(0);
        blinds.setLevel(0);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Número de acciones a registrar: ");
        int numAcciones = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 1; i <= numAcciones; i++) {
            System.out.println("\nAcción " + i + ":");
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.println("Seleccione: 1. Encender luz 2. Abrir puerta 3. Reproducir música 4. Ajustar volumen");
            System.out.print("Seleccione: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            Command comando = null;
            String descripcionAccion = "";
            int nivelVolumen = 0;
            
            switch (opcion) {
                case 1:
                    comando = new CommandLights(lights, true, usuario);
                    descripcionAccion = "Luz encendida";
                    break;
                case 2:
                    comando = new CommandDoors(doors, true, usuario);
                    descripcionAccion = "Puerta abierta";
                    break;
                case 3:
                    comando = new CommandMusic(music, true, usuario);
                    descripcionAccion = "Música reproducida";
                    break;
                case 4:
                    System.out.print("Ingrese valor (0-100): ");
                    nivelVolumen = scanner.nextInt();
                    scanner.nextLine(); 
                    comando = new CommandVolume(volume, nivelVolumen, usuario);
                    descripcionAccion = "Volumen ajustado a " + nivelVolumen + "%";
                    break;
                default:
                    System.out.println("Opción inválida");
                    i--; 
                    continue;
            }
            if (comando != null) {
                ejecutarComando(comando);
                System.out.println("\nAcción " + i + " ejecutada por " + usuario + ": " + descripcionAccion);
                System.out.print("Deshacer acción? (s/no): ");
                String respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equals("si")) {
                    deshacerComando(historialComandos.size() - 1);
                    String mensajeDeshecho = "";
                    switch (opcion) {
                        case 1:
                            mensajeDeshecho = "Luz apagada";
                            break;
                        case 2:
                            mensajeDeshecho = "Puerta cerrada";
                            break;
                        case 3:
                            mensajeDeshecho = "Música detenida";
                            break;
                        case 4:
                            mensajeDeshecho = "Volumen regresado a 0%";
                            break;
                    }
                    
                    System.out.println("Acción " + i + " deshecha: " + mensajeDeshecho);
                }
            }
        }
        mostrarHistorial();
        mostrarResumen();

    }
}