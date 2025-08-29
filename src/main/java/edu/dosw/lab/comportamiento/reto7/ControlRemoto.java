package edu.dosw.lab.comportamiento.reto7;

import java.util.*;

public class ControlRemoto {
    private List<RegistroAccion> historial;
    private List<RegistroAccion> undoHistorial;

    public ControlRemoto() {
        this.historial = new ArrayList<>();
        this.undoHistorial = new ArrayList<>();
    }

    public String ejecutarAccion(Command command) {
        String resultado = command.execute();
        historial.add(new RegistroAccion(command, resultado));
        return resultado;
    }

    public String deshacerAccion(int index) {
        if (index >= 0 && index < historial.size()) {
            RegistroAccion accion = historial.get(index);
            String resultado = accion.getComando().undo();
            undoHistorial.add(new RegistroAccion(accion.getComando(), resultado));
            return resultado;
        }
        return "Índice de acción no válido";
    }

    public void mostrarHistorial() {
        System.out.println("\n=== HISTORIAL COMPLETO DE ACCIONES ===");
        historial.stream()
                .forEach(System.out::println);
    }

    public void mostrarResumen() {
        System.out.println("\n=== RESUMEN FINAL ===");

        // Agrupar acciones por usuario usando Streams
        Map<String, List<String>> accionesPorUsuario = new HashMap<>();

        historial.stream()
                .forEach(registro -> {
                    String usuario = registro.getComando().getUsuario();
                    String tipo = registro.getComando().getTipo();

                    if (!accionesPorUsuario.containsKey(usuario)) {
                        accionesPorUsuario.put(usuario, new ArrayList<>());
                    }
                    accionesPorUsuario.get(usuario).add(tipo);
                });


        accionesPorUsuario.forEach((usuario, acciones) -> {
            System.out.println("\n" + usuario + " ejecutó:");
            acciones.stream()
                    .forEach(accion -> System.out.println("  - " + accion));
        });

        System.out.println("\n=== ACCIONES DESHECHAS ===");
        undoHistorial.stream()
                .forEach(System.out::println);
    }

    public List<RegistroAccion> getHistorial() {
        return historial;
    }
}