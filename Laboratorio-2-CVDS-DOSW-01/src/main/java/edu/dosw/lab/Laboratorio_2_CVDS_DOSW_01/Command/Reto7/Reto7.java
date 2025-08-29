package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Command.Reto7;
import java.text.Normalizer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reto7 {

    public static void run() {
        System.out.println("Ejecutando Reto7");
        Scanner sc = new Scanner(System.in);

        Luz luz = new Luz();
        Puerta puerta = new Puerta();
        Musica musica = new Musica();
        Persiana persiana = new Persiana(); 

        ControlRemoto control = new ControlRemoto();

        System.out.print("Número de acciones a registrar: ");
        int n = leerEntero(sc, 1, 100);

    
        Map<String,String> displayPorClave = new LinkedHashMap<>();

        for(int i=1; i<=n; i++){
            System.out.println("\nAcción " + i + ":");
            System.out.print("Usuario: ");
            String usuario = sc.next().trim();
            sc.nextLine();

            String clave = normalizar(usuario);
            displayPorClave.putIfAbsent(clave, usuario);

            System.out.println("Seleccione: 1. Encender luz  2. Abrir puerta  3. Reproducir música  4. Ajustar volumen  5. Ajustar persiana");
            int opcion = leerEntero(sc, 1, 5);

            int valor = 0;
            if(opcion == 4 || opcion == 5){
                System.out.print("Ingrese valor (0 - 100): ");
                valor = leerEntero(sc, 0, 100);
            }

            Comando cmd = ComandoFactory.crearComando(opcion, usuario, luz, puerta, musica, persiana, valor);
            control.ejecutar(cmd);


            String msgExec;
            switch(opcion){
                case 1: msgExec = "Luz encendida"; break;
                case 2: msgExec = "Puerta abierta"; break;
                case 3: msgExec = "Música reproducida"; break;
                case 4: msgExec = "Volumen ajustado a " + valor + "%"; break;
                default: msgExec = "Persiana ajustada a " + valor + "%"; break; // Mensaje de persiana
            }
            System.out.println("Acción " + i + " ejecutada por " + usuario + ": " + msgExec);

            System.out.print("¿Deshacer acción? (si/no): ");
            String resp = leerSiNo(sc); // Usar el filtro de "si/no"
            boolean deshizo = resp.equals("si");
            if(deshizo){
                control.deshacerUltima();
                String msgUndo;
                switch(opcion){
                    case 1: msgUndo = "Luz apagada"; break;
                    case 2: msgUndo = "Puerta cerrada"; break;
                    case 3: msgUndo = "Música detenida"; break;
                    case 4: msgUndo = "Volumen regresado a 0%"; break;
                    default: msgUndo = "Persiana regresada a 0%"; break;
                }
                System.out.println("Acción " + i + " deshecha: " + msgUndo);
            }
        }

        List<Comando> historial = control.getHistorial();
        System.out.println("\n---- Historial completo ----");
        for (int i = 0; i < historial.size(); i++) {
            Comando c = historial.get(i);
            boolean desh = (c instanceof ComandoBase) && ((ComandoBase)c).estaDeshecha();
            System.out.println((i+1) + ": " + c.getDescripcion() + " - Usuario: " + c.getUsuario() + (desh ? " (deshecha)" : ""));
        }


        System.out.println("\n--- Investigando quién desconfiguró los electrodomésticos ---");
        Map<String, Long> conteo = historial.stream()
            .filter(c -> !c.getDescripcion().equals("No alteró configuración")) // Filtra las acciones que alteraron la configuración
            .collect(Collectors.groupingBy(c -> normalizar(c.getUsuario()), LinkedHashMap::new, Collectors.counting()));

        String topKey = null; long max = -1;
        for (Map.Entry<String, Long> e : conteo.entrySet()){
            if(e.getValue() > max){ max = e.getValue(); topKey = e.getKey(); }
        }

        if(topKey != null){
            System.out.println("Se detecta que " + displayPorClave.getOrDefault(topKey, topKey)
                + " realizó " + max + " acciones que alteraron la configuración.");
        }
        conteo.forEach((key, value) -> {
            String nombre = displayPorClave.getOrDefault(key, key);
            System.out.println(nombre + " realizó " + value + " acción(es).");
        });
    }

    private static String normalizar(String s){
        String sinAcento = Normalizer.normalize(s, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        return sinAcento.toLowerCase(Locale.ROOT).trim();
    }

    private static int leerEntero(Scanner sc, int min, int max){
        while(true){
            while(!sc.hasNextInt()){
                System.out.print("Número inválido. Intente: ");
                sc.next();
            }
            int v = sc.nextInt();
            if(v >= min && v <= max) return v;
            System.out.print("Fuera de rango (" + min + "-" + max + "). Intente: ");
        }
    }

    public static String leerSiNo(Scanner sc){
        while(true){
            String respuesta = sc.next().trim().toLowerCase();
            if(respuesta.equals("si") || respuesta.equals("no")) {
                return respuesta;
            }
            System.out.print("Respuesta inválida. Por favor, ingrese 'si' o 'no': ");
        }
    }
}
