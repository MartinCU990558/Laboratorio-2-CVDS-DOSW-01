package edu.dosw.lab.Comportamiento.Reto7;

import javax.naming.AuthenticationNotSupportedException;
import java.util.*;
import java.util.stream.Collectors;

public class ControlRemoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Accion> historial = new ArrayList<>();
        System.out.println("Introduzca el numero de acciones a registrar: ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("\nAccion" + i + ":");
            System.out.println("Usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Seleccione accion: 1.Encender lluz 2.Abrir puerta 3.Reproducir música 4.Ajustar volumen 5.Ajustar persiana");
            int opcion = sc.nextInt();
            sc.nextLine();

            Accion accion = null;
            if(opcion == 1) accion = new AccionLuz(usuario);
            else if(opcion == 2 ) accion= new AccionPuerta(usuario);
            else if (opcion == 3) accion = new AccionPonerMusica(usuario);
            else if (opcion== 4){
                System.out.println("Ingrese valor (0-100): ");
                String valor = sc.nextLine();
                sc.nextLine();
                accion = new AccionVolumen(usuario, valor);
            }
            else if (opcion == 5) {
                System.out.println("Ingrese valor (0-100): ");
                String valor = sc.nextLine();
                sc.nextLine();
                accion = new AccionPersiana(usuario, valor);
            }
            if (accion != null){
                accion.ejecutar();
                System.out.println("¿Deshacer aacion? (si/no): ");
                String deshacer = sc.nextLine();
                if (deshacer.equals("si")){
                    accion.deshecha();
                }
                historial.add(accion);
            }
        }
        System.out.println("\n-----Historial completo-----");
        int indx = 1;
        for (Accion accion : historial) {
            String deshechos = accion.seDeshizo() ? "(deshecha)":"";
            System.out.println(indx + ". " + accion.getDescripcion() + "-Usuario: "+ accion.getUsuario() + deshechos);
        }
        System.out.println("\n-----Investigando quien desconfiguró los electrodomésticos-----");

        Map<String, Long> totalAcciones = historial.stream()
                .collect(Collectors.groupingBy(Accion::getUsuario, Collectors.counting()));

        Map<String, Long> accionesAlteradas = historial.stream()
                .filter(a -> !a.seDeshizo())
                .collect(Collectors.groupingBy(Accion::getUsuario, Collectors.counting()));

        for (Map.Entry<String, Long> entry : totalAcciones.entrySet()) {
            String usuario = entry.getKey();
            long total = entry.getValue();
            long alteradas = accionesAlteradas.getOrDefault(usuario, 0L);

            System.out.println("Se detecta que " + usuario + " realizó " + total +
                    " acciones y " + alteradas + " alteraron la configuración.");
        }
    }

}

