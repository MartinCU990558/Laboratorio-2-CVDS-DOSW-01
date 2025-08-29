package edu.dosw.lab.comportamiento.ControlRemotoMagicoReto7;

import java.util.*;

public class ControlRemoto {
    private List<Accion> historial = new ArrayList<>();

    public void ejecutarAccion(Accion accion, boolean deshacer) {
        accion.ejecutar();
        if (deshacer) {
            accion.deshacer();
        }
        historial.add(accion);
    }

    public void mostrarHistorial() {
        System.out.println("\n--- Historial completo ---");
        int i = 1;
        for (Accion acc : historial) {
            System.out.println(i++ + ": " + acc.getDescripcion() + " - Usuario: " + acc.getUsuario());
        }
    }

    public void resumenUsuarios() {
        System.out.println("\n--- Investigando quién desconfiguró los electrodomésticos ---");
        Map<String, Integer> contador = new HashMap<>();
        for (Accion acc : historial) {
            contador.put(acc.getUsuario(), contador.getOrDefault(acc.getUsuario(), 0) + 1);
        }
        for (String usuario : contador.keySet()) {
            System.out.println(usuario + " realizó " + contador.get(usuario) + " acción(es).");
        }
    }
}
