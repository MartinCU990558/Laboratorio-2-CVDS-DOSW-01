package edu.dosw.lab.comportamiento.Reto7;
import java.util.*;

public class Control {
    private List<Command> historial = new ArrayList<>();
    public void ejecutarAccion(Command accion, boolean deshacer) {
        if (deshacer) {
            accion.undo();
        }
        historial.add(accion);
        System.out.println();
    }
    public void mostrarHistorial() {
        System.out.println("\n--- Historial completo ---");

        java.util.stream.IntStream.range(0, historial.size())
                .mapToObj(i -> {
                    Command cmd = historial.get(i);
                    String linea = (i + 1) + ": " + cmd.getDescription() + " – Usuario: " + cmd.getUser();
                    if (cmd.isUndone()) {
                        linea += " (deshecha)";
                    }
                    return linea;
                })
                .forEach(System.out::println);
    }
    public void mostrarResumen() {
        System.out.println("\n--- Investigando quién desconfiguró los electrodomésticos ---");

        historial.stream()
                .collect(java.util.stream.Collectors.groupingBy(
                        Command::getUser,
                        java.util.stream.Collectors.counting()
                ))
                .forEach((usuario, cantidad) ->
                        System.out.println("Se detecta que " + usuario + " realizó " + cantidad + " acciones que alteraron la configuración.")
                );
    }
}